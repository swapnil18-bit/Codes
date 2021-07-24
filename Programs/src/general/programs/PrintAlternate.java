package general.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintAlternate {
    static int add(int a, int b){
        int cur,max=0,min=0;
        for(int i=a; i<b; i++){
            cur = i + a;
            for (int j=2; j<cur; j++){
                if(cur%j==0) break;
            }
            max = Math.max(b, cur);
            min = Math.min(a,cur);
        }
        return min+max;
    }
    public static void main(String[] args) {
      int a = -97;
      int b = 50;
        System.out.println(add(a, b));
    }
}
