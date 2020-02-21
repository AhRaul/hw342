import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibanacciMethod(15)));
    }

    /**
     * Сложность алгоритма = O(N)
     *
     * @param quantity количество рассчитываемых чисел Фибоначи
     * @return
     */
    private static int[] fibanacciMethod(int quantity) {
        int[] fibonacciMassiv = new int[quantity];
        if(quantity > 0) {
            fibonacciMassiv[0] = 0;
        }
        if(quantity > 1) {
            fibonacciMassiv[1] = 1;
        }
        if(quantity > 2) {
            for (int i = 2; i < quantity; i++) {
                fibonacciMassiv[i] = fibonacciMassiv[i-2] + fibonacciMassiv[i-1];
            }
        }
        return fibonacciMassiv;
    }
}
