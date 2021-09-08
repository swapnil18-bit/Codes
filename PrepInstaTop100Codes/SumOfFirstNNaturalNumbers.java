package PrepInstaTop100Codes;
import java.util.Scanner;
public class SumOfFirstNNaturalNumbers {
    protected static int naturalSum(int n){
        return n*(n+1)/2;
    }
    protected static int Method2(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        System.out.println("Sum : " + Method2(n));

    }
}