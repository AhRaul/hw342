public class Main {
    public static void main(String[] args) {
        BidirectList<Integer> bidirectList = new BidirectList<>();
        bidirectList.add(1);
        bidirectList.add(4);
        bidirectList.add(6);
        bidirectList.add(4);
        for(Integer item : bidirectList){
            System.out.println(item);
        }
    }
}
