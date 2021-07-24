//Length of longest substring without repeating characters

package Programs.easy.leetcode;

import java.util.ArrayList;
public class LengthOfLongestSubString {
    static int length(int n, String s){
        int max = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            ArrayList <Character> values = new ArrayList<>();
            for (int j=i; j<n; j++){
                if (values.contains(s.charAt(j))){
                    break;
                }else {
                    values.add(s.charAt(j));
                    count++;
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int n = s.length();
        System.out.println(length(n, s));
    }
}
