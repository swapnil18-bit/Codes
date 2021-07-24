package Programs.easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    static List<List<Integer>> triangle(int numrow){
        List<List<Integer>> final_list = new ArrayList<>();
        final_list.add(new ArrayList<>());
        final_list.get(0).add(1);
        for (int i=1; i<numrow; i++){
            List<Integer> current_list = new ArrayList<>();
            current_list.add(1);
            for (int j=1; j<i; j++){
                current_list.add(final_list.get(i-1).get(j-1) + final_list.get(i-1).get(j));
            }
            current_list.add(1);
            final_list.add(current_list);
        }
        return final_list;
    }
    public static void main(String[] args) {
        int numOfRows = 6;
        List<List<Integer>> list;
        list = triangle(numOfRows);
        System.out.println(list);
    }
}
