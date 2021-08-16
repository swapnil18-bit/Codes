package general.programs;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoUnsortedArrays {
    public static void main(String[] args) {
        int[] a = {10,20,50,30,60,25,45,10};
        int[] b = {35,30,75,70,50};
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        for (int i=0; i<b.length; i++){
            set.add(b[i]);
        }
        System.out.println(set);
    }
}
