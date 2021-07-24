package Programs.easy.leetcode;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,0,0,0,0};
        int[] b = {2,4,5,6};
        int m = 4;
        int n = b.length;
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;

        while (p2>=0){
            if (p1>=0 && a[p1]>b[p2]){
                a[i] = a[p1];
                i--;
                p1--;
            }else {
                a[i] = b[p2];
                i--;
                p2--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
