package general.programs;

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
        int a = 4;
        int b = 5;
        System.out.println("GCD: " + gcd(a,b));
        System.out.println("LCM: " + lcm(a,b));
    }
}
