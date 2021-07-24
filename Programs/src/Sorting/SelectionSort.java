package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{1,11,2,45,0,23,0,5};
        int n = a.length;
        for (int i=0; i<n-1; i++){
            int min = i;
            for (int j=i+1; j<n; j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        for (int q :
                a) {
            System.out.print(q+" ");
        }
    }
}
