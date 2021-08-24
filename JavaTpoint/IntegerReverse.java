package JavaTpoint;

public class IntegerReverse {
    public static int method1(int number){
        int digit = 0, res = 0;
        while (number!=0){
            digit = number%10;
            res = res*10 + digit;
            number/=10;
        }
        return res;
    }
    public static String method2(int number){
        String s = String.valueOf(number);
        String res = "";
        for (int i=s.length()-1; i>=0; i--){
            res = res + s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int a = 15480;
        System.out.println("Number = " + a);
        System.out.println("Method1: " + method1(a));
        System.out.println("Method2: " + method2(a));

    }
}
