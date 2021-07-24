//Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//
//
//
//        Example 1:
//
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.

package Programs.easy.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] a)
    {
        int size = a.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        /* sort the array of strings */
        Arrays.sort(a);

        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size-1].length());

        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;

         String pre = a[0].substring(0, i);
        return pre;
    }
    public static void main(String[] args) {
        String []a = {"asde","as","asd"};
        System.out.println(longestCommonPrefix(a));
    }
}
