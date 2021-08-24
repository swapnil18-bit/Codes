package Wipro;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix {
    static void display(int[][] a, int row, int col){
        ArrayList <Integer> z = new ArrayList<>();
        int top = 0, bot = col-1, left = 0, right = row-1, dir = 0;
        while (top<=bot && left<=right){
            if (dir==0){
                for (int i=left; i<=right; i++){
                    z.add(a[top][i]);
                }
                top++;
            }else if (dir == 1){
                for (int i=top; i<=bot; i++){
                    z.add(a[i][right]);
                }
                right--;
            }else if (dir == 2){
                for (int i=right; i>=left; i--){
                    z.add(a[bot][i]);
                }
                bot--;
            }else if (dir == 3){
                for (int i=bot; i>=top; i--){
                    z.add(a[i][left]);
                }
                left++;
            }
            dir = (dir+1)%4;
        }
        System.out.println(z);
    }
    public static void main(String[] args) {
        int[][] a = new int[][]{ {1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        display(a, 6, 3);
    }
}
