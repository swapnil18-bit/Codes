package PrepBytes.Fundamentals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 400 == 0){
            System.out.println("Leap");
        }else{
            if (year % 4 == 0 && year % 100 != 0){
                System.out.println("Leap");
            }else {
                System.out.println("Not A Leap Year");
            }
        }

    }
}
