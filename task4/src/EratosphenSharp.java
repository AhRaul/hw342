import java.util.LinkedList;

public class EratosphenSharp {

    public LinkedList<Integer> eratosphenMetod (int quantity) {
        if(quantity<2) {        //если quantity < 2, выходим из метода
            return null;
        }

        LinkedList<Integer> fullArray = new LinkedList<>();
        for(int i = 2; i<=quantity; i++) {      // заполнение массива целыми числами от 2 до quantity
            fullArray.add(i);
        }

        return fullArray;
    }
}
