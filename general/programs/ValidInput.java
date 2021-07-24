package general.programs;

public class ValidInput {
    static int numOfMisses(String s){
            char[] c = s.toCharArray();
            int count = 0;
            for (int i=0; i<c.length; i++){
                if (!Character.isLetter(c[i]) && !Character.isWhitespace(c[i]) && !Character.isDigit(c[i])){
                    ++count;
                }
            }
        return count;
    }
    public static void main(String[] args) {
        String s = "aa a234bc@ sad$ hsagd^";
        System.out.println(numOfMisses(s));
    }
}
