package conditional;

import java.util.Scanner;

public class NameOfDay {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number");
		
		int day=sc.nextInt();
		sc.close();
		
		if(day==1)
		{
			System.out.println("It's Monday");
		}
		else if(day==2)
		{
			System.out.println("It's Tuesday");
		}
		else if(day==3)
		{
			System.out.println("It's Wednesday");
		}
		else if(day==4)
		{
			System.out.println("It's Thrusday");
		}
		else if(day==5)
		{
			System.out.println("It's Friday");
		}
		else if(day==6)
		{
			System.out.println("It's Saturday");
		}
		else if(day==7)
		{
			System.out.println("It's Sunday");
		}
		else if(day%7==1)
		{
			System.out.println("It's Monday");
		}
		else if(day%7==2)
		{
			System.out.println("It's Tuesday");
		}
		else if(day%7==3)
		{
			System.out.println("It's Wednesday");
		}
		else if(day%7==4)
		{
			System.out.println("It's Thrusday");
		}
		else if(day%7==5)
		{
			System.out.println("It's Friday");
		}
		else if(day%7==6)
		{
			System.out.println("It's Saturday");
		}
		else if(day%7==0)
		{
			System.out.println("It's Sunday");
		}
	}

}
