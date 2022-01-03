package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to print Fibonnaci Series");
		System.out.println("Enter number of Terms");
		
		int n=sc.nextInt();
		sc.close();
		int a=0,b=1,c;
		System.out.print(a+","+b+",");
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
			
		}
	}

}
