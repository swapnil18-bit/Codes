package NumberPatterns;

public class IncreasingTriangle {
    public static void main(String[] args) {
        int n=5,k=1;
        for (int i=1; i<=n; i++){

            for (int j=0; j<i; j++){
                System.out.print(j+1 + " ");
            }

            for (int j=i; j<n; j++){
                System.out.print("  ");
            }

            for (int j=i; j<n; j++){
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){
                System.out.print(n-(n-k) + " ");
            }

            System.out.println();
        }
    }
}
