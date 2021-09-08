package All_Basics;

public class StringReverse {
    static String revString(String s){
        String t = "";
        for (int i=s.length()-1; i>=0; i--){
            t+=s.charAt(i);
        }
        return t;
    }
    public static void main(String[] args) {
        System.out.println(revString("Swapnil"));
    }
}
