package udemy;

import java.util.Scanner;

public class Cubiod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int length, breadth, height;
		int totalArea, volume;
		
		System.out.println("Enter length, breadth, height of cubiod");
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		
		totalArea=2*(length*breadth + breadth*height + height*length);
		volume= (length*breadth*height);
		
		sc.close();
		
		System.out.println("Total Area of Cubiod is "+totalArea);
		System.out.println("Total volume of Cubiod is "+volume);
	}

}
