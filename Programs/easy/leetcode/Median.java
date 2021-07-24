package Programs.easy.leetcode;

import java.util.Arrays;

public class Median {
    static double median(int a[]){

        if(a.length<1)
            return 0;

        if(a.length<2){
            return a[0];
        }else{
            Arrays.sort(a);
            int n = a.length;

            if(n%2==0){
                double med1 = ((a[(n-1)/2] + a[n/2]));
                return med1/2;
            }else{
                double med2 = a[n/2];
                return med2;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int b[] = {1,2,3,4,5};
        int c[] = {5};
        int d[] = {};
        System.out.println(median(a));
        System.out.println(median(b));
        System.out.println(median(c));
        System.out.println(median(d));
    }
}
