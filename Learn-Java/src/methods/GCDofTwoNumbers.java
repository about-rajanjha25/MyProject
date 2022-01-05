package methods;

import java.util.Scanner;

public class GCDofTwoNumbers {

	static int gcd(int m,int n)
	{
		while(m!=n)
		{
			if(m>n)
				m=m-n;
			else
				n=n-m;
		}
		return m;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		
		gcd(num1,num2);
		System.out.println("GCD of these two numbers is : "+gcd(num1, num2));
		
	}

}
