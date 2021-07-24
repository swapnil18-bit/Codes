package Programs.easy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfLettersInString {
    public static Map<Character,Integer> frequencyOfLetters(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c:
             arr) {
            if (map.containsKey(c)){
                map.replace(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        String s = "yyyyyeeeeessssszzzzz";
        HashMap<Character,Integer> map1;
        map1 = (HashMap<Character, Integer>) frequencyOfLetters(s);//copying of map to map1 by casting
        System.out.println("y:" + map1.get('y'));
        System.out.println("e:" + map1.get('e'));
        System.out.println("s:" + map1.get('s'));
        System.out.println("z:" + map1.get('z'));
    }
}
