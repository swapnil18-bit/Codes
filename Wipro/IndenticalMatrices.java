package Wipro;

public class IndenticalMatrices {
    static int checkMatrices(int[][] a, int[][] b, int n, int m){
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (a[i][j]!=b[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        int[][] b = new int[][]{ {1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 7}};
        System.out.println(checkMatrices(a, b, a.length, b.length));
    }
}
