package JavaTpoint;

public class PrimeNumber {
    static boolean isPrime(int n){
        if(n==1 || n==0) return false;
        int i = n/2;
        for (i=2; i<n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPrime(num));
    }
}
