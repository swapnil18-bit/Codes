package Accenture.programs;

import java.util.HashSet;
import java.util.Set;

public class NoOfDistinctElements {
    public static int countDistinct(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,6,8,2,10,8};
        System.out.println("no of distinct : " + countDistinct(a));
    }
}
