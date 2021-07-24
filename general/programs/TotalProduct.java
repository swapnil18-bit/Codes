package general.programs;

public class TotalProduct {
    public static void main(String[] args) {
        int[] array = {43,345,20,987};
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            int cur = array[i];
            int count = 0;
            while (cur > 0){
                count = count + cur%10;
                cur = cur/10;
            }
            System.out.print(count + " ");
        }
    }
}
