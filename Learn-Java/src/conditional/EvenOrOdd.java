package conditional;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		
		int n=sc.nextInt();
		sc.close();
		
		if(n%2==0)
		{
			System.out.println("It is an Even number");
		}
		else
		{
			System.out.println("It is an odd number");
		}
	}

}
