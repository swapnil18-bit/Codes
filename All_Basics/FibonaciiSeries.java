package All_Basics;
import java.util.Scanner;

public class FibonaciiSeries {
    static void fibonacci(int count){
        int num1=0, num2=1, num3;
        System.out.print(num1 + " " + num2 + " ");
        for (int i=2; i<count; i++){
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter count of fibonacci series : ");
        int count = in.nextInt();
        fibonacci(count);
    }
}
