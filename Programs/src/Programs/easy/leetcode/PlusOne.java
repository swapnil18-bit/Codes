package Programs.easy.leetcode;

import java.util.Arrays;

public class PlusOne {
    public  static int[] plusOne(int [] arr){
        for (int i=arr.length-1; i>=0; i--){
            if (arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int [] new_array = new int[arr.length+1];
        new_array[0] = 1;
        return new_array;
    }
    public static void main(String[] args) {
        int [] a = {9,8,9,8};
        int [] arr = plusOne(a);
        System.out.println(Arrays.toString(arr));
    }
}
