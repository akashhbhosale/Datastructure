package quick.sort.ds;

import java.util.Arrays;

public class QuickSort {
	
	public static void Swap (int [] arr, int x, int y) {
		int temp = arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static void quickSort(int []  arr, int left,  int right) {
		// Special case :if array have 1 or null element.
		if (left >= right)
		{
			return;
		}
		 // Consider left element as pivot
		int i = 0, j= right;
		//1. from left (i = index ) greater than pivot;
		while ( i<j){
			while (i<= right && arr[i] <= arr[left]) {
			i++;
		}
		// 2.From right (j- index ) greater than pivot or equal to pivot;
		while (arr [j]> arr[left])
			j--;
		//3.if i is less than j swap i to j;
		if (i<j)
			Swap(arr, i, j);
	}
		//4.repeat above 3 steps i<j;
		// 5.swap jth element with pivot element;
		Swap(arr, j, left);
		// 6. apply quick sort to left partition left to j-1;
		quickSort(arr, left, j-1);
		// 7. apply quick sort to right partition - j+1 right; 
		quickSort(arr, j+1, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///int [] arr = {8,9,1,3,5,7,2,6,4};
		int [] arr = {4,3,2,1};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
