package Programs.easy.leetcode;
public class TwoSum {

	static void CheckSum(int arr[], int target) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (arr[i] + arr[j] == target) {
					System.out.println("[" + i + "," + j + "]");
				}
			}
		}

	}
	public static void main(String[] args) {

		 int arr[] = {1,2,3,4,5},target=5;
		 CheckSum(arr, target);

		}
}
