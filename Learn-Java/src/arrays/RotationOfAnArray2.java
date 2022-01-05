package arrays;

public class RotationOfAnArray2 {

	public static void main(String[] args) {
		
		int A[]= {3,9,7,8,12,6,14,5,4,10};
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		
		int temp=A[A.length-1];
		
		for(int i=0;i<( A.length)-1;i++)
		{
			A[i+1]=A[i];
			
		}
		A[0]=temp;
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");	
	
	}

}
