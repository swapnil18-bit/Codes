package Accenture.programs;


public class SumOf2ndLargest {
    public static int returnSum(int[]a) {
        int[] odd1 = new int[a.length / 2 + 1];
        int[] even0 = new int[a.length / 2 + 1];
        int j = 0, k = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                even0[j] = a[i];
                j++;
            } else {
                odd1[k] = a[i];
                k++;
            }
        }
        int p = 0, q = 0, r = 0, s = 0;
        int index = 0, ind = 0;

        for (int i = 0; i < even0.length; i++) {
            if (even0[i] > p) {
                p = even0[i];
                index = i;
            }
        }
        for (int i = 0; i<even0.length; i++){
            if (i!=index && even0[i]>q){
                q = even0[i];
            }
        }
        for (int i = 0; i < even0.length; i++) {
            if (odd1[i] > r) {
                r = odd1[i];
                ind = i;
            }
        }
        for (int i = 0; i<even0.length; i++){
            if (i!=ind && odd1[i]>s){
                s = odd1[i];
            }
        }
        return q + s;
    }
    public static void main(String[] args) {
        int[] a = {3,4,1,7,9,15};
        System.out.println(returnSum(a));
    }
}
