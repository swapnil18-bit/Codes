package HackerRank;


public class CountingValley {
    static int CountValleyy(int n, String s){
        int step=0,valley=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='U')
                step++;
            else
                step--;
            if (step==0 && s.charAt(i)=='U')
                valley++;
        }
    return valley;
    }
    public static void main(String[] args) {
        String s = "UDDDUDUU";
        int n = s.length();
        System.out.println(CountValleyy(n, s));
    }
}
