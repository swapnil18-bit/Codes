package All_Basics;

public class LCMandHCD {
    static int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    static int lcm(int a, int b){
        return a/gcd(a,b)*b;
    }
    public static void main(String[] args) {
        int a = 30;
        int b = 35;
        System.out.println("GCD: " + gcd(a,b));
        System.out.println("LCM: " + lcm(a,b));
    }
}
