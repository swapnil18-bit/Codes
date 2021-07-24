package Programs.easy.leetcode;

public class MedianOfTwoSortedArrays {
    static float median(int[] nums1, int[] nums2, int m, int n){
        int [] newArray = new int[m+n];
        int i=0,j=0,k=0;

        while (i<m && j<n){
            if(nums1[i] < nums2[j]){
                newArray[k++] = nums1[i++];
            }else {
                newArray[k++] = nums2[j++];
            }
        }
        while (i<m){
            newArray[k++] = nums1[i++];
        }
        while (j<n){
            newArray[k++] = nums2[j++];
        }

        if (newArray.length % 2 == 0){
            float n1 = newArray[newArray.length/2];
            float n2 = newArray[(newArray.length-1)/2];
            return (n1+n2)/2;
        }else {
            return (float) newArray[newArray.length/2];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {2};
        int[] nums2 = {};
        int m = nums1.length;
        int n = nums2.length;
        System.out.println(median(nums1, nums2, m, n));
    }
}
