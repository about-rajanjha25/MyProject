package oops;

class StudentTest
{

	public int rollNumber;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	public int total()
	{
		return m1+m2+m3;
	}
	public float average()
	{
		return (float)total()/3;
	}
	
	public char grade()
	{
		if(average()>=60)
			return 'A';
		else
			return 'B';
	}
	public String details()
	{
		return "Roll Number:"+rollNumber+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}
	
}
public class Student {
	
	public static void main(String[] args) {
		
		StudentTest s=new StudentTest();
		s.rollNumber=1;
		s.name="Sona";
		s.course="CS";
		s.m1=90;
		s.m2=70;
		s.m3=55;
		
		System.out.println("Total :"+s.total());
		System.out.println("Average :"+s.average());
		
		System.out.println("Details :\n"+s.details() );
		
	}

}
