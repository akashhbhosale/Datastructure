package app.search.linear;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LnrSearch {
	
	public static int LinearSearch(int[] A,int key)
	{
		for (int i=0; i<A.length; i++)
		if (key==A[i])
		{
			return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		int [] arr= new int [size];
		System.out.println("Enter array elemets :");
		for (int i=0; i<size; i++)
		{
			 arr[i] = sc.nextInt();
		}
		System.out.println("Enter key");
		int key = sc.nextInt();
		int i=LinearSearch(arr, key);
		
		System.out.println("key is found at index :"+i);
	}

}
