package general.programs;

import java.util.Arrays;

public class MergeSortedArraysOfSameLength {
    public static int[] mergeSortedArrays(int[] a, int[] b){
        int m = a.length;
        int n = b.length;
        int i=0,j=0,k=0;
        int[] c = new int[m+n];
        while (i<m && j<n){
            if (a[i]<b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i<m){
            c[k] = a[i];
            i++;
            k++;
        }
        while (j<n){
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a = {0,2,4,6,6};
        int[] b = {1,2,3,5,5};
        int c[] = mergeSortedArrays(a,b);
        System.out.println(Arrays.toString(c));
    }
}
