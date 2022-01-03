package conditional;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year: ");
		
		int yr=sc.nextInt();
		sc.close();
		
		if(yr%4==0)
		{
			if(yr%100==0)
			{
				if(yr%400==0)
				{
					System.out.println("This is Leap Year");
				}
				else
				{
					System.out.println("This is not a Leap Year");
				}
			}
			else
			{
				System.out.println("This is Leap Year");
			}
		}
		else
		{
			System.out.println("This is not a Leap Year");
		}
	}

}
