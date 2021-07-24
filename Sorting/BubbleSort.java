package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1,76,3,5,-2,0};
        int temp;
        int n = a.length;
        for(int i=0; i<n-1; i++){
            int f = 1;
            for(int j=i+1; j<n; j++){
                if(a[j]<a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    f=0;
                }
            }
            if(f==1){
                break;
            }
        }
        for (int q :
                a) {
            System.out.println(q);
        }
    }
}
