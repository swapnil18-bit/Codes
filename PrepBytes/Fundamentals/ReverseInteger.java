package PrepBytes.Fundamentals;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 876540;
        int dig = 0, n = 0;
        while(num>0){
            dig = num%10;
            n = n*10 + dig;
            num = num/10;
        }
        System.out.println(n);
    }

}
