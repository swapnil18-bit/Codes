package general.programs;

public class ReturnDiffOfMaxAndMinNumberInArray {
    static int findLargeSmallDifference(int n, int[] nums){
        int min = nums[0], max = nums[0];
        for (int i=1; i<n; i++){
            if (nums[i]<min){
                min = nums[i];
            }else if (nums[i]>max){
                max = nums[i];
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        int []nums = {10,11,7,12,14,107};
        int n = nums.length;
        System.out.println(findLargeSmallDifference(n, nums));
    }
}
