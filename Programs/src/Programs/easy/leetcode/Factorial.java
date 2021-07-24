package Programs.easy.leetcode;

public class Factorial {
    public static int factorial(int num){
        for (int i=num-1; i>=1; i--){
            num = num * i;
        }
        return num;
    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println(factorial(num));
    }
}
