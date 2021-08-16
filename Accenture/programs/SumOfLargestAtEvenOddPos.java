//def LargeSmallSum(arr)
//
//        The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of
//        second largest largest element from the even positions and second smallest from the odd position of given
//        ‘arr’
//
//        Assumption:
//
//        All array elements are unique
//        Treat the 0th position a seven
//        NOTE
//
//        Return 0 if array is empty
//        Return 0, if array length is 3 or less than 3
//        Example
//
//        Input
//
//        arr:3 2 1 7 5 4
//
//        Output
//
//        7
//
//        Explanation
//
//        Second largest among even position elements(1 3 5) is 3
//        Second largest among odd position element is 4
//        Thus output is 3+4 = 7
//        Sample Input
//
//        arr:1 8 0 2 3 5 6
//
//        Sample Output
//
//        8

package Accenture.programs;

import java.util.Arrays;

public class SumOfLargestAtEvenOddPos {
    static void largeSum(int n, int[] arr){
        int[] oddSorted = new int[(arr.length/2) + 1];
        int[] evenSorted = new int[(arr.length/2) + 1];
        int j = 0,  k = 0;
        for (int i=0; i<arr.length; i++){
            if (i%2 == 0){
                oddSorted[j++] = arr[i];
            }else {
                evenSorted[k++] = arr[i];
            }
        }

        Arrays.sort(evenSorted);
        Arrays.sort(oddSorted);

        System.out.println("odd:" + Arrays.toString(oddSorted));
        System.out.println("even:" + Arrays.toString(evenSorted));

        System.out.println(oddSorted[oddSorted.length - 2] + evenSorted[evenSorted.length - 2]);
    }
    public static void main(String[] args) {
        int[] array = {3,2,1,7,5,4};
        int n = array.length;
        largeSum(n,array);
    }
}
