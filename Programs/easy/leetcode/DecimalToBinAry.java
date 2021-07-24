package Programs.easy.leetcode;

import java.util.Scanner;

public class BinaryToDecimal {
    static int binaryToDecimal(int num){
        int decimal=0,p=0,temp = 0,i=1;
        while (true){
            if(num == 0){
                break;
            }else {

                temp = num % 10;
                decimal+= i * temp;
                num = num / 10;
                i = i * 2;
            }
        }
        return decimal;
    }
    static int binaryToDecimal1(int num){
//        return Integer.parseInt(String.valueOf(num),2);
          return Integer.parseInt(Integer.toBinaryString(num));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Binary number : ");
        int num = in.nextInt();
//        System.out.println("Decimal Number(Method 1) :  " + binaryToDecimal(num));
//        System.out.println("Decimal Number(Method 2) :  " + binaryToDecimal1(num));
        System.out.println(Integer.toBinaryString(num));
    }
}
