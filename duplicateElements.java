package app.duplicate.ele;

public class duplicateElements {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4,5,1,2};
		for (int i=0; i<A.length; i++)
		{
			for (int j=i+1; j<A.length; j++)
			{
				if (A[i]==A[j])
				{
					System.out.println("Duplicate element is :"+A[i]);
				}
			}
			
		}
		
	}


}
