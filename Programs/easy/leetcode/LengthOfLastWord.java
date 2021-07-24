package Programs.easy.leetcode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        int length = 0;

        for (int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' ') length++;
            else break;
        }
        return length;
    }
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLastWord(s));
    }
}
