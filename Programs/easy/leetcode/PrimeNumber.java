package Programs.easy.leetcode;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 93;
        int temp = 0;
        for (int i=2; i<=n-1; i++){
            if (n%i==0){
                temp = 1;
                break;
            }
        }
        if (temp==0){
            System.out.println("prime number");
        }else {
            System.out.println("Not a Prime number");
        }
    }
}
