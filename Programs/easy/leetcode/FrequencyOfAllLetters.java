package Programs.easy.leetcode;

import java.util.HashMap;

public class FrequencyOfAllLetters {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeeffffff";
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c:
             arr) {
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        System.out.println("Frequency of letter:");
        System.out.println(map);
    }
}
