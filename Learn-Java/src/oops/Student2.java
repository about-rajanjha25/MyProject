package oops;

public class Student2 {
	
	int m1 = 0,m2 = 0,m3 = 0;
	int rollNumber = 0;
	String name = null;
	String course = null;
	
	int total()
	{
		return m1+m2+m3;
	}
	float average()
	{
		return (float)total()/3;
	}
	
	char grade()
	{
		if(average()>=60)
			return 'A';
		else
			return 'B';
	}
	String details()
	{		
		return "Roll Number:"+rollNumber+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}
	
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
