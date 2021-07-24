//Program to find the sum of all odd frequency elements in an array is discussed here.
//        An array of integers is given as input and the sum of elements having odd frequency is found and
//        produced as output. This means elements which repeat an odd number of times in the given array will be
//        identified and the sum of these will be the expected output.
//
//
//
//        For example, consider an array arr = {1, 2, 4, 5, 6, 3, 1, 2, 3, 3}
//
//
//
//        Here, elements 1 and 2 repeats twice (even), whereas elements 4, 5, 6 are present only once (odd) and element
//        3 occurs thrice (odd). Hence,
//
//        Elements having odd frequency : {4, 5, 6, 3, 3, 3}
//        Sum of elements having odd frequency: 24



package general.programs;

import java.util.HashMap;
import java.util.Map;

public class SumOfOddFreqNum {
    static int returnSum(int n, int[] array){
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else {
                map.put(array[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()%2!=0){
                for (int i = 0; i < entry.getValue(); i++) {
                    result+=entry.getKey();
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 3, 1, 2, 3, 3};
        int n = arr.length;
        System.out.println(returnSum(n, arr));
    }
}
