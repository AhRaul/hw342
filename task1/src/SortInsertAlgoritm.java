import java.util.Arrays;

public class SortInsertAlgoritm {
    public static void main(String[] args) {
        System.out.println("Before sort:");
        int[] massiv = {1, 4, 8, 5, 3, 2, 0, 8};
        System.out.println(Arrays.toString(massiv));
        System.out.println("After sort:");
        System.out.println(Arrays.toString(sortMethodAlgorithm(massiv)));
    }

    /**
     * максимальная сложность алгоритма = O(N^2), где O - операция, N- количество переменных.
     * Количество операций зависит от сортируемого массива.
     * @param massiv
     * @return
     */
    private static int[] sortMethodAlgorithm(int[] massiv) {
        int assistValue;                                //переменная для запоминания переносимого числа
        if(massiv.length >=2 ) {                //обрабатываем массив, только если в нём имеется не менее 2-х элементов
            for (int j = 1; j < massiv.length; j++) {   //два цыкла, прямой проход
                for(int i = j; i > 0; i--) {            //обратный проход
                    if (massiv[i - 1] > massiv[i]) {    //т.к. первая половина отсортирована, то проверка идёт только
                                                        //до ближайшего, меньшего числа, чем рассматриваемое число "j"
                        assistValue = massiv[i - 1];
                        massiv[i - 1] = massiv[i];
                        massiv[i] = assistValue;
                    } else {                            //остановка обратного прохода
                        break;
                    }
                }
            }
        }
        return massiv;
    }
}
