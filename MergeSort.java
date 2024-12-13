package merge.sort.ds;

import java.util.Arrays;

public class MergeSort {

	public static void MergeSort1(int[] arr, int left, int right) {
		// If partition is invalid and have single element then
		if (left >= right)
			return;
		// Divide array in two equal partitions
		int mid = (left + right) / 2;
		// Solve left partition [left to mid]
		MergeSort1(arr, left, mid);
		// solve right partition [mid +1 to right]
		MergeSort1(arr, mid + 1, right);
		// create temp array to accomodate both partition
		int temp[] = new int[right - left + 1];
		// Merge two sorted partitions into temp array
		int i = left, j = mid + 1, k = 0;
		// Overwrite temp array to original array
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= right) {
			temp[k++] = arr[j++];
		}
		for (i = 0; i < temp.length; i++) {
			arr[left + i] = temp[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 9, 1, 3, 5, 7, 2, 6, 4 };
		System.out.println(Arrays.toString(arr));
		MergeSort1(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
