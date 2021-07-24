package Programs.easy.leetcode;

import java.util.Arrays;
import java.util.Scanner;

class DecimalToBinary {
    static String decToBinary(int num){
        int[] a = new int[50];
        int i = 0;
        while (num>0){
            a[i] = num % 2;
            num = num / 2;
            i++;
        }
        String c = "";
        for(int j=i-1; j>=0; j--){
            c+= Integer.toString(a[j]);
        }
        return c;
    }
    static int decToBinary2(int num){
        return Integer.parseInt(Integer.toBinaryString(num));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Decimal number : ");
        int num = in.nextInt();
        System.out.println("Binary Number(Method 1) :  " + decToBinary(num));
        System.out.println("Binary Number(Method 2) :  " + decToBinary2(num));
    }
}

