package arrays;

public class MaxElement {

	public static void main(String[] args) {
		
		int A[]= {3,19,7,8,12,6,14,5,4,10};
		
		int max=A[0];
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
		}
		System.out.println("Maximum element is : "+max);
	}

}
