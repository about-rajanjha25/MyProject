package loops;

import java.util.Scanner;

public class AP_Series {

	public static void main(String[] args) {
		
		//Arithmetic Progression series
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to print AP series");
		System.out.println("Enter a, d and n");
		
		int a=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		
		sc.close();
		
		int term=a;
		for (int i=0;i<n;i++)
		{
			System.out.print(term+",");
			term=term+d;
		}
		
	}

}
