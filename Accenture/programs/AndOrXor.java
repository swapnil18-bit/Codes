package Accenture.programs;

public class AndOrXor {
    static int operations(String s){
        if(s.length()<2) return s.charAt(0);
        int res = s.charAt(0) - '0';
        int i=0;
        while (i+2<s.length()){
            if(s.charAt(i+1) == 'A'){
                res = res & s.charAt(i+2) - '0';
            }else if(s.charAt(i+1) == 'B'){
                res = res | s.charAt(i+2) - '0';
            }else if(s.charAt(i+1) == 'C'){
                res = res ^ s.charAt(i+2) - '0';
            }
            i+=2;
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "0C1A1B1C1C1B0A0";
        System.out.println(operations(s));
    }
}
