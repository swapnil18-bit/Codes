package general.programs;
//TechM
public class DiffBetSumOfOddNumAndEven {
    static int diff(int n, int[] arr){
        int oddSum=0, evenSum = 0;
        for (int i=0; i<n; i++){
            if (arr[i]%2==0){
                evenSum+=arr[i];
            }else {
                oddSum+=arr[i];
            }
        }
        return evenSum-oddSum;
    }
    public static void main(String[] args) {
        int[] nums = {10,11,7,12,14};
        int n = nums.length;
        System.out.println(diff(n, nums));
    }
}
