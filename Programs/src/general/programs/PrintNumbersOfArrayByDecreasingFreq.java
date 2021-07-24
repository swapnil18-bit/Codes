package general.programs;
import java.util.*;


public class PrintNumbersOfArrayByDecreasingFreq {
    static void sort(int n, int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> revmap = new HashMap<>();
        for (int i=0; i<n; i++){
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i])+1);
            }else {
                map.put(array[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            revmap.put(entry.getValue(), entry.getKey());
        }

        Integer[] values = map.values().toArray(new Integer[0]);
        Arrays.sort(values);

        System.out.println(map);
//        System.out.println(revmap);
//        System.out.println(Arrays.toString(values));
        System.out.println("After sorting in decreasing order of freq:");
        for (int i=values.length-1; i>=0; i--){
            for (int j=0; j<values[i]; j++){
                System.out.print(revmap.get(values[i]) + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,1,3,1,3,1,1,3,1,2,1,1};
        int n = arr.length;
        System.out.println("Given array is: " + Arrays.toString(arr));
        sort(n, arr);

    }
}
