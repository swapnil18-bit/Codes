package Sorting;

import java.util.Arrays;

class Merging{
    static void MG(int[]a, int low, int mid, int high){
        int i,j,k;
        i = k = low;
        j = mid + 1;
        int[]b = new int[100];
        while (i<=mid && j<=high){
            if (a[i]<=a[j]){
                b[k] = a[i];
                i++;k++;
            }else {
                b[k] = a[j];
                j++;k++;
            }
        }
        while (i<=mid){
            b[k] = a[i];
            i++;k++;
        }
        while (j<=high){
            b[k] = a[j];
            j++;k++;
        }
        if (high + 1 - low >= 0) System.arraycopy(b, low, a, low, high + 1 - low);
    }
    static void MS(int[]a, int low, int high){
        if (low<high){
            int mid = (low+high)/2;
            Merging.MS(a,low,mid);
            Merging.MS(a,mid+1,high);
            Merging.MG(a,low,mid,high);
        }
    }
}
public class demo {

    public static void main(String[] args) {
        int []a = {1,11,2,45,0,0,45,2,11,1};
        System.out.println(Arrays.toString(a));
        int n = a.length;
        Merging.MS(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}