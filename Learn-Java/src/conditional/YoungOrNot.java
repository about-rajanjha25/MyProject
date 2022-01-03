package conditional;

import java.util.Scanner;

public class YoungOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person's current age");
		
		int age=sc.nextInt();
		sc.close();
		
		if(age<14)
		{
			System.out.println("Perso is a kid");
		}
		else if(age>=14 && age<55)
		{
			System.out.println("Person is young");
		}
		else
		{
			System.out.println("Person is old");
		}
	}

}
