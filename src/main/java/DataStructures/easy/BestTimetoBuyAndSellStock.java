package DataStructures.easy;

public class BestTimetoBuyAndSellStock {
    public static void main(String[] args) {
        BestTimetoBuyAndSellStock b = new BestTimetoBuyAndSellStock();
        System.out.println(b.bestTimeToBuyAndSell(new int[]{7,1,5,3,6,4,10}));
    }
    public int bestTimeToBuyAndSell(int[] prices){
        int n = prices.length;
        int maximumProfit =0,minimumStockValue =Integer.MAX_VALUE;
        int i=0;
        while (i<n){
            minimumStockValue = Math.min(minimumStockValue,prices[i]);
            if(prices[i] >= minimumStockValue){
                maximumProfit = Math.max(maximumProfit,prices[i]-minimumStockValue);
            }
            i++;

        }
        return maximumProfit;
    }
}
