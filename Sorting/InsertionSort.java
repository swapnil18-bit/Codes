package Sorting;

public class InsertionSort {
    static void InsertSort(int[] a, int n){
        for(int i=1; i<n; i++){
            int key = a[i];
            int j = i - 1;
            while (j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        for (int o :
             a) {
            System.out.print(o + " ");
        }
    }
    public static void main(String[] args) {
        int []a = {1,11,2,45,0,23,0,5};
        int n = a.length;
        InsertSort(a,n);
    }
}
