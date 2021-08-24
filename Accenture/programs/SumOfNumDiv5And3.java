package Accenture.programs;

public class SumOfNumDiv5And3 {
    public static int countSum(int a, int b){
        int sum = 0;
        for (int i=a; i<=b; i++){
            if (i % 3 == 0 && i % 5 == 0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 160;
        System.out.println(countSum(a, b));

    }
}
