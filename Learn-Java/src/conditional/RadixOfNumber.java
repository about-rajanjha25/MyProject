package conditional;

import java.util.Scanner;

public class RadixOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		String num;
		
		num=sc.nextLine();
		sc.close();
		
		if(num.matches("[01]+"))
		{
			System.out.println("Number is 'Binary' and radix is:2");
		}
		else if(num.matches("[0-7]+"))
			{
				System.out.println("Number is 'Octal' and radix is:8");
			}
		else if(num.matches("[0-9]+"))
		{
			System.out.println("Number is 'Decimal' and radix is:10");
		}
		else if(num.matches("[0-9A-F]+"))
		{
			System.out.println("Number is 'Hexa-Decimal' and radix is:16");
		}
		else
		{
			System.out.println("Invalid number");
		}
	}

}
