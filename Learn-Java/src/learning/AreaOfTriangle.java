package learning;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the width of the Triangle:");
	    double base = scan.nextDouble();

	    System.out.println("Enter the height of the Triangle:");
	    double height = scan.nextDouble();
		
		
        
        double area = (0.5)*base*height;
        
        System.out.println("Area of triangle is "+area);
        
        scan.close();
	}
 
}
