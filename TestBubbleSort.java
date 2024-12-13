package app.sort.bubble;

import java.util.Arrays;

public class TestBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ab [] = {6,5,4,3,2,1};
		System.out.println("Before Sorting array  ab is : "+Arrays.toString(ab));
		BubleSort(ab);
		System.out.println("After Sorting array  ab is : "+Arrays.toString(ab));
	}

	private static void BubleSort(int[] A) {
		// TODO Auto-generated method stub
		for (int i=0; i<A.length-1; i++)
		{
			for (int j=0; j<A.length-1-i; j++)
			{
				if (A[j]>A[j+1])
				{
					int temp = A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
		}
	}
	}
}
