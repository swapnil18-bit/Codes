package Programs.easy.leetcode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void removeDuplicates(int [] nums){
       Set<Integer> set = new HashSet<>();
        for (int a:
             nums) {
            set.add(a);
        }
        Integer [] expectedNums = new Integer[set.size()];
        set.toArray(expectedNums);
        System.out.println(Arrays.toString(expectedNums));
    }

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
}




