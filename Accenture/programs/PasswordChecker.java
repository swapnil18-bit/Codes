package Accenture.programs;

public class PasswordChecker {
    static int check(String s){
        int lower=0,upper=0;
        if(s.length()<4 || Character.isDigit(s.charAt(0))) return 0;
        else {
            for (int i=0; i<s.length(); i++){
                if(s.charAt(i) == '/' || Character.isWhitespace(s.charAt(i))) return 0;
                else if (Character.isUpperCase(s.charAt(i))) ++upper;
            }
        }
        if(upper>0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        String s = "Oa987abp012";
    }
}
