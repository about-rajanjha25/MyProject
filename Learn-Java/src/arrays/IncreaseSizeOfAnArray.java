package arrays;

public class IncreaseSizeOfAnArray {

	public static void main(String[] args) {
		
		int A[]= {8,6,10,9,2};
		System.out.println(A.length);
		
		int B[]=new int[2*A.length];
		
		for(int i=0;i<A.length;i++)
		{
			B[i]=A[i];
		}
		for(int x:B)
			System.out.print(x+",");
		System.out.println("");
	}

}
