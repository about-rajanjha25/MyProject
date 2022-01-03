package udemy;

import java.util.Scanner;

public class RootsOfQuadEqn {

	public static void main(String[] args) {
		
		//ax^2+bx+c=0; this is quadratic equation
		//(x+r1)(x+r2)=0; this roots of above eqn
		Scanner scan=new Scanner(System.in);
		
		int a,b,c;
		double r1,r2;
		
		System.out.println("Enter value of a,b,c");
		
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		r1= (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		r2= (-b - Math.sqrt(b - 4*a*c))/(2*a);
		
		scan.close();
		
		System.out.println("First root is "+r1);
		System.out.println("Second root is "+r2);
		
	}

}
