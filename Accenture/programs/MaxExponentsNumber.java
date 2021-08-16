package Accenture.programs;

public class MaxExponentsNumber {
    public static int maxCompnents(int a, int b){
        int count = 0, max = 0, num = 0;
        for (int i=a; i<=b; i++){
            if(i%2==0){
                count = countExp(i);
            }
            if (count>max){
                num = i;
                max = count;
            }
        }
        return num;
    }

    public static int countExp(int num){
        int count = 0;
        while (num%2 == 0 && num!=0){
            num = num/2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        System.out.println(maxCompnents(a, b));
    }
}
