package Accenture.programs;

public class ReplaceCh1ByCh2 {
    public static String replceOneByTwo(String s, char p, char q){
        if (s==null) return null;
        if(!s.contains(""+p) && !s.contains(""+q) || p==q) return s;
        String res = "";
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == p){
                res+=q;
            }else if(s.charAt(i)==q){
                res+=p;
            }else {
                res+=s.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = null;
        System.out.println(replceOneByTwo(s, 'q', 'z'));
    }
}
