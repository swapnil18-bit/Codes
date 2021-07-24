package Sorting;

import java.util.Arrays;

public class MergeSort {
    static void Merge(int[]a, int low, int mid, int high){
        int[]b = new int[100];
        int i = low;
        int k = low;
        int j = mid+1;
        while (i<=mid && j<=high){
            if (a[i]<=a[j]){
                b[k] = a[i];
                i++;
                k++;
            }else {
                b[k] = a[j];
                j++;
                k++;
            }
        }
        while (i<=mid){
            b[k] = a[i];
            i++;
            k++;
        }
        while (j<=high){
            b[k] = a[j];
            j++;
            k++;
        }
        for (int l = low; l <= high; l++)
        {
            a[l] = b[l];
        }
    }

    static void MergeSortt(int[]a, int low, int high){
        if (low<high){
            int mid = (low+high)/2 ;
            MergeSortt(a,low,mid);
            MergeSortt(a,mid+1,high);
            Merge(a,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int[]a = {1,11,2,45,0,23,0,5,45,5,0};
        System.out.println(Arrays.toString(a));
        int n = a.length;
        MergeSortt(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
