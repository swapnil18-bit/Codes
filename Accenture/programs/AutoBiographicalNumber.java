package Accenture.programs;

import java.util.*;

public class AutoBiographicalNumber {
    public static int autoBio(String s){

        boolean res = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            if (map.containsKey(Character.getNumericValue(s.charAt(i)))){
                map.put(Character.getNumericValue(s.charAt(i)), map.get(Character.getNumericValue(s.charAt(i)))+1);
            }else {
                map.put(Character.getNumericValue(s.charAt(i)), 1);
            }
        }

        for (int i=0; i<s.length(); i++){
            if (!map.containsKey(i)) map.put(i, 0);
        }

        for (int i=0; i<s.length(); i++){
            int freq = Character.getNumericValue(s.charAt(i));
            if (map.containsKey(i) && map.get(i) == freq){
                res = true;
            }else {
                res = false;
                break;
            }

        }

        int count = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if (e.getValue()>0) count++;
        }

        System.out.println(map);
        System.out.println(res);
        return count;
    }
    public static void main(String[] args) {
        String s = "6210001000";
        System.out.println(autoBio(s));
    }
}
