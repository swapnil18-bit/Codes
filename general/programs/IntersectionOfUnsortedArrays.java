package general.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfUnsortedArrays {
    public static void main(String[] args) {
        int[] a = {10,20,50,30,60,25,45,10};
        int[] b = {10,35,30,75,70,50,45};
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (a.length>b.length){
            for (int i=0; i<a.length; i++){
                set.add(a[i]);
            }

            for (int i=0; i<b.length; i++){
                if (set.contains(b[i])){
                    list.add(b[i]);
                }
            }

        }else {
            for (int i=0; i<b.length; i++){
                set.add(b[i]);
            }
            for (int i=0; i<a.length; i++){
                if (set.contains(a[i])){
                    list.add(b[i]);
                }
            }
        }
        System.out.println(list);

    }
}
