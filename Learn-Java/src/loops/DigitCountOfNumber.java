package loops;

import java.util.Scanner;

public class DigitCountOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		sc.close();
		
		int count = 0;
		
		while(n>0)
		{
			n=n/10;
			count++;
			
		}System.out.println("Number of digit is "+count++);
		
	}

}
