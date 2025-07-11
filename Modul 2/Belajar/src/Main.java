public class Main {
    public static void main(String[] args) {
        String[] items = {"item 1", "item 2", "item 3"};
        int[] prices = {10, 20, 30};

        int totalPrice = 0;
        totalPrice = getTotalPrice(items, prices, totalPrice);

        System.out.println(totalPrice);
    }

    private static int getTotalPrice(String[] items, int[] prices, int totalPrice){
        for (int i =0; i < items.length; i++){
            totalPrice+=prices[i];
        }
        return  totalPrice;
    }
}
