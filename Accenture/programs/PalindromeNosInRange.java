package Accenture.programs;

import java.util.ArrayList;
import java.util.Arrays;


public class PalindromeNosInRange {
    public static void allPalindromeNosInRange(int a, int b){
        ArrayList<Integer> list = new ArrayList<>();
        int digit = 0,cur, value,num;
        for (int i=a; i<=b; i++){
            num = 0;
            cur = i;
            value = i;
            while (cur!=0){
                digit = cur%10;
                num = num*10 + digit;
                cur = cur/10;
            }
            if (num == value) list.add(value);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        allPalindromeNosInRange(a,b);
    }
}
