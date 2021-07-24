package general.programs;

public class OccurenceOfChar {
    public static void main(String[] args) {
        String s = "haveagoodday";
        char c = 'a';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++;
        }
        System.out.println(count);
    }
}
