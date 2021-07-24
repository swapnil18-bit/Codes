package Programs.easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    static List<Integer> rowOfPascalsTriangle(int numRow){
        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(new ArrayList<>());
        finalList.get(0).add(1);
        for (int i=1; i<numRow; i++){
            List<Integer> current_list = new ArrayList<>();
            current_list.add(1);
            for (int j=1; j<i; j++){
                current_list.add(finalList.get(i-1).get(j-1) + finalList.get(i-1).get(j));
            }
            current_list.add(1);
            finalList.add(current_list);
        }
        return finalList.get(numRow-1);
    }
    public static void main(String[] args) {
        int rowNum = 5;
        List<Integer> list;
        list = rowOfPascalsTriangle(rowNum);
        System.out.println(list);
    }
}
