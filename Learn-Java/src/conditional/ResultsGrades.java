package conditional;

import java.util.Scanner;

public class ResultsGrades {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks of each subject");
		
		int mt=sc.nextInt();
		int sci=sc.nextInt();
		int eng=sc.nextInt();
		int comp=sc.nextInt();
		int ss=sc.nextInt();
		
		int totalMarks=(mt+sci+eng+comp+ss);
		System.out.println("Total marks is : "+totalMarks);
		int avg=totalMarks/5;
		System.out.println("Avgerage marks is : "+avg);
		
		sc.close();
		
		if(avg>=75)
		{
			System.out.println("The grade is 'A'");
		}
		else if(avg>=60 && avg<75)
		{
			System.out.println("The grade is 'B'");
		}
		else if(avg>=45 && avg<60)
		{
			System.out.println("The grade is 'C'");
		}
		else if(avg>=30 && avg<45)
		{
			System.out.println("The grade is 'D'");
		}
		else
		{
			System.out.println("The grade is 'F'");
		}
	}

}
