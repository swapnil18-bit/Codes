package Programs.easy.leetcode;

public class BestTimeToBuyAndSellStock {
    static int maxProfit(int[] arr){
        // o(n^2)
        int max = 0;
        for (int i=arr.length-1; i>=0; i--){
            for (int j=i-1; j>=0; j--){
                if (arr[i]>arr[j]){
                    max = Math.max(arr[i] - arr[j], max);
                }
            }
        }
        return max;
    }
    static int maxProfitMethod2(int[] prices){
        //o(n)
        if (prices.length == 0) return 0;
        int min = prices[0];
        int profit;
        int max = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = price - min;
            max = Math.max(profit, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        System.out.println(maxProfit(array));
        System.out.println(maxProfitMethod2(array));
    }
}
