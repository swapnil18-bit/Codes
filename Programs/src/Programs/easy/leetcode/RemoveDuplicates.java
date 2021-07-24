package Programs.easy.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums = {0,0,1,2,2,3,3,3,4,4};
        int [] expectedNums = new int[nums.length];
        int k = 1;
        expectedNums[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            if (nums[i]!=nums[i-1]){
                k+= 1;
                expectedNums[k-1] = nums[i];
            }
        }
        System.out.println("Before : " + Arrays.toString(nums) + "\n" + "After : ");
        System.out.println("Unique elements : " +  k);
        System.out.println(Arrays.toString(expectedNums));
    }
}
