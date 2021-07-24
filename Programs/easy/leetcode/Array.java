// REVERSE EACH STRING IN ARRAY AND REVERSE ARRAY ITSLEF
package Programs.easy.leetcode;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lenght of an array : ");
		int length = input.nextInt();
		String c[] = new String[length];
		System.out.println("Enter elements of array :  ");
		for(int k=0;k<length;k++) {
			c[k] = input.next();
		}input.close();
		
		 String newArray[] = new String[c.length];
		 int len = c.length-1;
		 for(int i=0;i<c.length;i++) {
			 String word = c[i];
			 String d = "";
			 for(int j=word.length()-1;j>=0;j--) {
				  d += word.charAt(j);
			 }
			 newArray[len]= d;
			 len--;
		 }
		 System.out.println("Reversed Array of Reversed Strings:");
		System.out.print("[ ");
		 for(String g : newArray) {
			 System.out.print(g + " ");
		 }
		System.out.print("]");
	}

}
