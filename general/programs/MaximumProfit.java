package general.programs;

public class MaximumProfit {
    static int maxProfit(int n, int[] profit){
        if (n == 1) return profit[0];
        int max = 0;
        for (int i=0; i<n; i++){
            int maxProfit = profit[i];
            int pre = i;
            for (int j=pre; j<n; j++){
                if (pre<j && profit[j]%profit[pre]==0){
                    maxProfit+=profit[j];
                    pre = j;
                }
            }
            max = Math.max(max,maxProfit);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] profit = {4 ,7 ,21 ,26, 28 ,29 ,32 ,34 ,36 ,42};
        int n = profit.length;
        System.out.println(maxProfit(n, profit));
    }
}
