package All_Basics;

public class MoveHyphen {
    public static String moveHyphen (String str, int n)
    {
        if (str.length() == 0) return "";
        String res = "";
        for (int i = 0; i < n; i++)
        {
            if (str.charAt (i) == '-')
                res = str.charAt (i) + res;
            else
                res = res + str.charAt (i);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "Move-Hyphens-to-Front";
        System.out.println(moveHyphen(s, s.length()));
    }
}
