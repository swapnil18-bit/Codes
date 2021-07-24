package general.programs;

public class MaxDiffBetweenTwoAdjElementsOfArray {
    static int findMaxDifference(int n, int[] nums){
        int max = nums[1] - nums[0];
        for (int i=1; i<n; i++){
            if (nums[i] - nums[i-1] > max){
                max = nums[i] - nums[i-1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,1000,2,3,1000,5,2500,8,10,122,222};
        int n = arr.length;
        System.out.println(findMaxDifference(n, arr));
    }
}
