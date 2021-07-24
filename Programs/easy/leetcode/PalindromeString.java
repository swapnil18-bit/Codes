package Programs.easy.leetcode;

import java.util.Scanner;

public class PalindromeString {
    static boolean palindrome(String s){

        int n = s.length();
        int start = 0, end = s.length()-1;

        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = in.next();
        System.out.println(palindrome(str));
    }
}
