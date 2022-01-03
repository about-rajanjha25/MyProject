package udemy;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c;
		float s;
		double area;

		System.out.println("Enter 3 sides of a Triangle");

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		s = (a + b + c) / 2f;

		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.println("Area of triangle is " + area);
	}
}
