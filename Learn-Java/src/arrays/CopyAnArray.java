package arrays;

public class CopyAnArray {

	public static void main(String[] args) {
		
		int A[]= {3,9,7,8,12,6,14,5,4,10};
		
		int B[]=new int[10];
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		
		for(int i=0;i<A.length;i++)
		{
			B[i]=A[i];
		}
		
		for(int x:B)
			System.out.print(x+",");
		System.out.println("");
	}

}
