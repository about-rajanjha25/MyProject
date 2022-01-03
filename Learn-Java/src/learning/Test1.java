/*WAP to read a number (entered by user)
* WAP to check if the given number is positive or negative
* WAP to add two numbers*/
package learning;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any number: ");
		
        int num1 = scan.nextInt();
        
		
		if(num1>0) {
			System.out.println("It is a positive number");
		}
		else if(num1<0){
			System.out.println("It is a negative number");
			
		}
		else {
			System.out.println("It is Zero");
		}
			int num2 =10;
			int sum = num1+num2;
		
			scan.close();
			System.out.println("Addition of two numbers is "+sum);
			
		
	}

}
