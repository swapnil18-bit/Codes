package Searching;

public class LinearSearch {
    static int linearSearch(int element, int[] a, int n){
        for(int i=0; i<n; i++){
            if(a[i] == element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int n = a.length;
        int element = 170;
        System.out.println("Element" + element + "Found at index: " + linearSearch(element,a,n));
    }
}
//Time complexity :  O(n)