package app.binarysearch.recurssion;

import java.util.Scanner;

public class BinarySearch {
	
	public static int recBinarySearch(int A[], int key, int left, int right)
	{
		if (left<=right)
		{
		int middle =(left+right)/2;
		{
			if (key == A [middle])
			{
				return middle;
			}
			if (key < A[middle])
			{
				return recBinarySearch (A, key, left, middle-1);
			}
			else
			{
				return recBinarySearch (A, key, middle+1, right);
			}
		}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	
		//Array size;
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		//Array elements
		System.out.println("Enter array elements");
		int array[]= new int [size];
		for (int i=0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		
		//Key Entry
		System.out.println("Enter key element");
		int key =  sc.nextInt();
		
		int index = recBinarySearch(array, key, 0, size-1);
		if (index!=-1)
		{
			System.out.println("key is found at index " +index);
		}
		else 
		{
			System.out.println("key is not found");
		}
		sc.close();
		}
}
