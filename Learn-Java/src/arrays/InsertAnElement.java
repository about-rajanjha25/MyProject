package arrays;

public class InsertAnElement {

	public static void main(String[] args) {
		
		//insert '15' at index 2:
		
		int A[]= new int[10];
			
			A[0]=5;
			A[1]=9;
			A[2]=6;
			A[3]=10;
			A[4]=12;
			A[5]=7;
		int n=6;
		
		for(int i=0;i<n;i++)
			System.out.print(A[i]+",");
		System.out.println("");
		
		int x=15;
		int index=2;
		
		for(int i=n;i>index;i--)
			A[i]=A[i-1];
		A[index]=x;
		
		for(int i=0;i<=n;i++)
			System.out.print(A[i]+",");
		System.out.println("");
	
	}

}
