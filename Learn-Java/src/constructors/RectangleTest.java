package constructors;

class Rectangle
{
	private double length;
	private double breadth;
	
	public Rectangle()
	{
		length=1;
		breadth=1;
	}
	
	public Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}
	public Rectangle(double s)
	{
		length=breadth=s;
	}
	
}
public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(10.5,8.5);
		
	}

}
