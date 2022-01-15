package arrays;

public class Practice1 {

	public static void main(String[] args) {
		
		int A[][]= {{1,2,3,4},{2,4,6,8},{3,5,7,9}};
		
		for(int x[]:A) 
		{
			for(int y:x)
			{
				System.out.print(y);
				System.out.print(", ");
			}
			System.out.println("  ");
		}
		
	}

}
