package All_Basics;

public class IntegerPalindrome {
    static boolean isPalindrome(int n){
        int a = n;
        int dig;
        int num = 0;
        while (n>0){
            dig = n%10;
            num=(num*10)+dig;
            n/=10;
        }
        if(num==a) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
