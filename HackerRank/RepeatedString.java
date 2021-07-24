package HackerRank;

public class RepeatedString {
    static int RepString(String s, int n){
        String temp = "";
        int count = 0;
        int length = 0;
        while (length<=n){
            temp = temp + s;
            length = temp.length();
        }
        temp = temp.substring(0, n);
        for (int j=0; j<n; j++){
            if (temp.charAt(j)=='a'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "a";
        int n = 10000;
        System.out.println(RepString(s,n));
    }
}
