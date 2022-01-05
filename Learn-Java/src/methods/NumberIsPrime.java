package methods;

import java.util.Scanner;

public class NumberIsPrime {

	static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();
		sc.close();
		
		if(isPrime(num))
			System.out.println("It is a Prime number");
		else
			System.out.println("It is not a Prime number");
	}

}
