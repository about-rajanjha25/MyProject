package loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		sc.close();
		int m=n;
		int d,sum=0;
		while(n>0)
		{
			d=n%10;
			n=n/10;
			
			sum=sum+(d*d*d);
		}
		if(m==sum)
			{
			System.out.println("It is an Armstrong number");
			}
		else
		{
			System.out.println("It is not an Armstrong number");
		}
	}

}
