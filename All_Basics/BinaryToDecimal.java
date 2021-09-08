package All_Basics;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "10001";
        int a = Integer.parseInt(s);
        int result = 0, num=1;
        while (a>0){
             int digit = a%10;
             result+= digit*num;
             num*=2;
             a/=10;
        }
        System.out.println(result);
    }
}
