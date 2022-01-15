package arrays;

public class TwoD_Practice1 {

	public static void main(String[] args) {
		int B[][]= {{1,2,3},{2,4,6},{1,3,5}};
		
		for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<B[i].length;j++)
			{
			System.out.print(B[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
