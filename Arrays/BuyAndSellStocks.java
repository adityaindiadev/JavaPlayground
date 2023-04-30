package Arrays;

public class BuyAndSellStocks {

    public static void printProfit(int array[]) {
        

        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int sellingPrice = 0;

        for (int i = 0; i < array.length; i++) {
            
            if (buyingPrice < array[i]) {
                
                int profit = array[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);

                sellingPrice = maxProfit > profit ? sellingPrice : array[i];
                System.out.println(profit);


            }else{

                    buyingPrice = array[i];
            }

            

        }
        System.out.println("buyingPrice: " + buyingPrice);
        System.out.println("sellingPrice: " + sellingPrice);
        System.out.println("maxProfit: " + maxProfit);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 6, 3, 4 };

        printProfit(arr);

    }
}
