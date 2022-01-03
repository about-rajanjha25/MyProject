package loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		sc.close();
		int m=n, d, rev = 0;
		
		while(n>0)
		{
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(m==rev)
			System.out.println("It's a Palindrome Number");
		else 
			System.out.println("It's not a Palindrome Number");
	}

}
