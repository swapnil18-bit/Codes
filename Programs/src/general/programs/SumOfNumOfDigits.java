//        Given an array A of N elements, find the sum S of those elements in the array whose sum of digits is equal
//        to gen number Read the input from STDIN and print the output to STDOUT. Do not write arbitrary strings
//        while reading the input or while printing as these contribute to the standard output.
//        Constraints; 1<=N<=1000
//        Input Format:
//        The first line of input contains N The second line of input contains N elements separated by a single white
//        space The last line of input contains K
//        Output Format: The output contains the sum S.
//        Sample Input1:
//        198 567 345 9234 11 6 18
//        Sample Output: 9999
//        Explanation1:
//        Array A with 6 elements is given and K 18.
//        The sum of digits of 198(1+9+8), 567(5+6+7) and 9234(9+2+3+4) is 18. The other elements' digits do not add
//        up to 18. Therefore, the output is the sum of these three elements: 198 567+9234-9999

package general.programs;

public class SumOfNumOfDigits {
    static int returnSumOFnum(int n, int[] array, int targetNum){
        int num = 0, result = 0, curNum;
        for (int i = 0; i < n; i++) {
            curNum = array[i];
            num = 0;
            while (curNum>0){
                int curDigit = curNum%10;
                num = num + curDigit;
                curNum = curNum/10;
            }
            if (num == targetNum) result = result + array[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {198,567,345,9234,11,6};
        int n = array.length;
        int target = 18;
        int a = returnSumOFnum(n, array, target);
        System.out.println(a);
    }
}

















