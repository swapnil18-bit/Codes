package HackerRank;
//There is a large pile of socks that must be paired by color. Given an array of integers representing
//the color of each sock, determine how many pairs of socks with matching colors there are.
import java.util.HashSet;

public class SalesByMatch {
    static int SocksPair(int n, int ar[]){
        HashSet<Integer> bucket = new HashSet<Integer>();
        int pairs = 0;
        for (int i=0; i<n; i++){
            if (bucket.contains(ar[i])) {
                pairs++;
                bucket.remove(ar[i]);
            }else {
                bucket.add(ar[i]);
            }

        }
        return pairs;
    }
    public static void main(String[] args) {
        int ar[] = new int[]{1,2,1,2,3,2,3,1,2,3,2};
        int n = ar.length;
        System.out.println(SocksPair(n, ar));

    }
}
