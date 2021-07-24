//Reverse an Integer
package Programs.easy.leetcode;
import java.util.Scanner;

public class IntegerReverse {
    static int ReverseInt(int num){
        if (num == 0)
            return 0;
        int digit,reversed = 0;
        while(num!=0){
            digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return reversed;
    }

    static int ReverseInt1(int num){
        if (num == 0)
            return 0;
        String s = String.valueOf(num);
        String temp = "";
        for (int i=s.length()-1;i>=0;i--){
            temp += String.valueOf(s.charAt(i));
        }
        return num = Integer.parseInt(temp);
    }
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter Integer:");
        int num = in.nextInt();
        in.close();
        System.out.println("Reversed Integer(Method 1) : " + ReverseInt(num));
        System.out.println("Reversed Integer(Method 2) : " + ReverseInt1(num));


    }

}
