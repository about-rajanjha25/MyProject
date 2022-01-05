package arrays;

public class SumOfAllElements {

	public static void main(String[] args) {
		
		int sum=0;
		
		int A[]= {3,9,7,8,12,6,14,5,4,10};
		
		for(int i=0;i<A.length;i++)
		{
			sum=sum + A[i];
			
		}
		System.out.println("Sum of All elements is : "+sum);
		
		//Using for each loop:
	/*	int sum=0;
		
		int A[]= {3,9,7,8,12,6,15,5,4,10};
		
		for(int x:A)
		{
			sum=sum + x;
			
		}
		System.out.println("Sum of All elements is : "+sum);  
  */	
	
	}

}
