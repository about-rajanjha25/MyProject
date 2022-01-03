package patterns;

public class Patterns11 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=3-i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=3-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
