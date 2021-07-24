package Programs.easy.leetcode;

public class MaximumSubarray {
    //Kedanes Algo
    public static int maximumSubarray(int [] nums){
        int max_sum = nums[0];
        int current_sum = max_sum;
        for (int i=1; i<nums.length; i++){
            current_sum = Math.max(nums[i], nums[i] + current_sum);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int [] nums = {1,8,0,-4,-12};
        System.out.println(maximumSubarray(nums));
    }
}
