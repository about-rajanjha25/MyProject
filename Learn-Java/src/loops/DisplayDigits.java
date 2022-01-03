package loops;

import java.util.Scanner;

public class DisplayDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		sc.close();
		
		int d;
		while(n>0)
		{
			d=n%10;
			n=n/10;
			System.out.println(d);
		}
		//System.out.println(n);
	}

}
