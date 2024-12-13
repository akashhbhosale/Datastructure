package app.sort.selection;

import java.util.Arrays;

public class selectionSort {
	   public static int swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        return array[j];
	    }
	
	public static int SelectionSort1(int [] A)
	{
		for (int i=0; i<A.length-1; i++)
		{
			for (int j=i+1; j<A.length; j++)
			{
				if (A[i]>A[j])
				{
					return swap(A, i, j);
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ab [] = {5,4,3,6};
		int sortedab = SelectionSort1(ab);
		System.out.println("Sorted array is : "+Arrays.toString(ab));
	}
}
