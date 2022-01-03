package learning;

import java.util.Scanner;

public class ASCII_Value {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any character: ");
		
        char c = scan.next().charAt(0);
        
        int asciiValue = (int)c;
        
        System.out.println("ASCII value of given character is "+asciiValue);
        
        scan.close();
	}

}
