package app.sort.bubble;

import java.util.Arrays;

public class bubbleSort {
public static void BubleSort(int [] A)
{
	for (int i=0; i<A.length-1; i++)
	{
		for (int j=0; j<A.length-1; j++)
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
