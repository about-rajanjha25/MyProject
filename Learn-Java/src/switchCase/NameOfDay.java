package switchCase;

import java.util.Scanner;

public class NameOfDay {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number");
		
		int day=sc.nextInt();
		sc.close();
		
		switch(day)
		{
		case 1: System.out.println("It's Monday");
				break;
		case 2: System.out.println("It's Tuesday");
				break;
		case 3: System.out.println("It's Wednesday");
				break;
		case 4: System.out.println("It's Thrusday");
				break;
		case 5: System.out.println("It's Friday");
				break;
		case 6: System.out.println("It's Saturday");
				break;
		case 7: System.out.println("It's Sunday");
				break;
		default : System.out.println("Invalid day");
		
		}
	}

}
