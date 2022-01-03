package loops;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		sc.close();
		int m=n;
		int d, rev = 0;
		
		while(n>0)
		{
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}System.out.println("Reverse of number "+m+" is : " +rev);
		
	}

}
