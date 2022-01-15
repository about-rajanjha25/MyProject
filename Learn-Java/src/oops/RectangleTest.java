package oops;

import java.util.Scanner;

class Rectangle2
{
	private double length;
	private double breadth;
	
	public double getLength()
	{
		return length;
	}
	public double getBreadth()
	{
		return breadth;
	}
	
	public void setLength(double l)
	{
		if(l>0)
			length=l;
		else
			length=0;
	}
	public void setBreadth(double b)
	{
		if(b>0)
			breadth=b;
		else
			breadth=0;
	}
	
	
	public double area()
	{
		return length*breadth;
	}
	
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	public boolean isSquare()
	{
		if(length==breadth)
			return true;
		else
			return false;
	}
}
public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle2 r=new Rectangle2();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth");
		
		int l1=sc.nextInt();
		int b1=sc.nextInt();
		
		sc.close();
		
		r.setLength(l1);
		r.setBreadth(b1);
		
		System.out.println("Area is : "+r.area());
		System.out.println("Perimeter is : "+r.perimeter());
		System.out.println("It is a Square : "+r.isSquare());
	
		System.out.println("Length : "+r.getLength());
		System.out.println("Breadth : "+r.getBreadth());
		
		
	}

}
