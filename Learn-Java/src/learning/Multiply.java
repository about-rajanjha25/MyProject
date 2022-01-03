package learning;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers (Press Enter after each):");

		int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int mul=num1*num2;
        System.out.println("Multiplication of two given numbers is "+mul);
        
        scan.close();
	}

}
