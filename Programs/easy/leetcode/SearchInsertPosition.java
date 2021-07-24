package Programs.easy.leetcode;

public class SearchInsertPosition {
    public static int searchInsertPostion(int [] arr, int target){
        for(int i=0; i<arr.length; i++){
            if (arr[i] == target) return i;
            else if (arr[i] >= target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,12,4,5,6,8};
        int target = 11;
        System.out.println(searchInsertPostion(arr,target));
    }
}
