package arrays;

public class ReverseCopyAnArray {

	public static void main(String[] args) {
		
        int A[]= {3,9,7,8,12,6,14,5,4,10};
		
		int B[]=new int[10];
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		
		int i,j;
		for(i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j]=A[i];
		}
		
		for(int x:B)
			System.out.print(x+",");
		System.out.println("");
		
	}

}
