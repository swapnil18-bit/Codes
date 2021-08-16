package Accenture.programs;
import java.util.*;
public class NBaseNotation {
    public static void decToNBase(int a, int number) {
        ArrayList<Integer> listRemainings = new ArrayList<>();
        String finalString = "";
        int quotient = number / a, remainder;
        listRemainings.add(number % a);

        while (quotient != 0) {
            listRemainings.add(quotient % a);
            quotient /= a;
        }

        for (int i=0; i<listRemainings.size(); i++){
            if(listRemainings.get(i)<9){
                finalString = listRemainings.get(i) + finalString;
            }else {
                finalString = (char) (listRemainings.get(i)-9+64) + finalString;
            }
        }

        System.out.println(finalString);
    }
    public static void main(String[] args) {
        int a = 21, num = 5678;
        decToNBase(a, num);
    }
}
