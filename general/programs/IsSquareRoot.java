package general.programs;

public class IsSquareRoot {
    static boolean isSqrt(double num){
        double sqrt = Math.sqrt(num);
        if (sqrt - Math.floor(sqrt) == 0){
            return true;
        }
        return false;
    }
    static boolean isSqrt2(double num){
        for (int i=1; i*i<=num; i++){
            if (i*i == num && num/i == i && num%i==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        double num = 729;

        if(isSqrt(num)){
            System.out.println("perfect square!");
        }else System.out.println("not a perfect square");

        if(isSqrt2(num)){
            System.out.println("perfect square!");
        }else System.out.println("not a perfect square");
    }
}
