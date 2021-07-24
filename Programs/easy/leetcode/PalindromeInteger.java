package Programs.easy.leetcode;

public class PalindromeInteger {
    static boolean isPalindrome(int num){
        String str = String.valueOf(num);
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            if (str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = -101;
        System.out.println(isPalindrome(num));
    }
}
