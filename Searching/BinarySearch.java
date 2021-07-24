package Searching;

public class BinarySearch {
    static int binarySearch(int[] a, int low, int high, int element){
        if (low<=high){
            int mid = (low+high)/2;
            if (a[mid] == element)
                return mid;

            if(element < a[mid])
                return binarySearch(a, low, mid, element);

            return binarySearch(a,mid+1,high,element);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 10, 20, 30, 50, 100, 110, 130, 170};
        int n = a.length;
        int element = 50;
        int index = binarySearch(a, 0, n-1, element);
        if (index == -1){
            System.out.println("Element not found!");
        }else {
            System.out.println("Element found at index : " + index);
        }
    }
}
