package switchCase;

import java.util.Scanner;

public class ArithOpsMenu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("====");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		
		System.out.println("Enter the two numbers");
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		sc.nextLine();
		int add=n1+n2;
		int sub=n1-n2;
		int mul=n1*n2;
		int div=n1/n2;
		
		System.out.println("Enter Option in words");
		String option=sc.nextLine();
		
		sc.close();
		
		switch(option)
		{
		case "ADD":System.out.println("Adition is "+add);
					break;
		case "SUB":System.out.println("Substraction is "+sub);
					break;
		case "MUL":System.out.println("Multiplication is "+mul);
					break;
		case "DIV":System.out.println("Division is "+div);
					break;
		default: System.out.println("Invalid operation");
		}
	}

}
