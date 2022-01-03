package conditional;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		
		int n=sc.nextInt();
		sc.close();
		
		if(n>=0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
	}

}
