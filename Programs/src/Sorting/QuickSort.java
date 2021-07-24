package Sorting;
import java.util.Arrays;

public class QuickSort {
    static int partition(int[] a, int low, int high){
        int pivot = a[low];
        int i = low+1;
        int j = high;
        int temp;

        do
        {
            while (i<=high &&a[i] <= pivot)
            {
                i++;
            }

            while (j>=low && a[j] > pivot)
            {
                j--;
            }

            if (i < j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        } while (i < j);

        // Swap A[low] and A[j]
        temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
    }
    static void QuickSort(int[] a,int low, int high){
        int partitionIndex;
        if(low < high){
            partitionIndex = partition(a,low,high);
            QuickSort(a,low,partitionIndex-1);
            QuickSort(a,partitionIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int []a = {6,2,0,9,4,111,3,5};
        System.out.println(Arrays.toString(a));
        int n = a.length;
        QuickSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}