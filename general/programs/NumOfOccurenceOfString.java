package general.programs;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumOfOccurenceOfString {
    static int Method1(String s, String target){
        String in = s;
        int i = 0;
        Pattern p = Pattern.compile(target);
        Matcher m = p.matcher( in );
        while (m.find()) {
            i++;
        }
        return i;
    }

    static int Method3(String s, String target){
        return (s.length() - s.replaceAll(target, "").length()) / target.length() ;
    }
    public static void main(String[] args) {
        String s = "swapnilswapnilswapnilswapnil";
        s = s.toLowerCase();
        System.out.println("ByMethod1 " + Method1(s, "nil"));
        System.out.println("ByMethod3 " + Method3(s, "nil"));

    }
}
