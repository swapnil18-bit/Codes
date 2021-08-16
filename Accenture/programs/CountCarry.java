package Accenture.programs;

public class CountCarry {
    public static int countCarry(int p, int q){
        int count = 0, aDigit = 0, bDigit = 0, carry = 0;
        while (p>0 && q>0){
            aDigit = p % 10;
            bDigit = q % 10;
            if (aDigit + bDigit + carry>9){
                count++;
                carry = (aDigit+bDigit+carry)/10;
            }
            p/=10;
            q/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 111;
        int b = 999;
        System.out.println(countCarry(a,b));
    }
}
