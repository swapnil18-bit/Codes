package JavaTpoint;

public class Swap2Numbers {
    public static void withBitwiseOp(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Method 1: " + a + " " + b);
    }
    public static void withAddMinus(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Method 2: " + a + " " + b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        withBitwiseOp(a,b);
        withAddMinus(a,b);
    }
}
