package general.programs;

public class MaximumProfit {
    static int maxProfit(int n, int[] profit){
        if (n == 1) return profit[0];
        int maxProfit = profit[0], cur = profit[0];
        for (int i=1; i<n; i++){
            if (maxProfit<profit[i] && profit[i]%cur== 0){
                cur = profit[i];
                maxProfit = maxProfit + profit[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] profit = {1,2,3,4,9,8};
        int n = profit.length;
        System.out.println(maxProfit(n, profit));
    }
}
