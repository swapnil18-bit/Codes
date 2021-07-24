package general.programs;

public class TotalTax {
    static int calcTotalTax(int n, long[] nums){
        int tax = 0;
        for (int i=0; i<n; i++){
            if (nums[i]>1000){
                tax+= (nums[i]-1000)*0.1;
            }
        }
        return tax;
    }
    public static void main(String[] args) {
        long[] nums = {1000,2000,3000,4011,5000};
        int n = nums.length;
        System.out.println(calcTotalTax(n, nums));
    }
}
