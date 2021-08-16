package Accenture.programs;

public class RatCountHouse {
    static int count(int n, int[] a, int rats, int unit){
        if (a.length<1) return 0;
        int product = rats*unit;
        int res = 0;
        for (int i=0; i<=n; i++){
            res+=a[i];
            if(res>=product) return i+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {2,8,3,5,7,4,1,2};
        //System.out.println(count(arr.length, arr, 7, 2));

    }
}
