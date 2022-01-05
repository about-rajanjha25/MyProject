package arrays;

import java.util.Scanner;

public class SearchAnElement {

	public static void main(String[] args) {
		
		int A[]= {3,9,7,8,12,6,5,4,10};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key");
		int key=sc.nextInt();
		sc.close();
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==key)
			{
				System.out.println("Element is at index : "+i);
				System.exit(0);
			}
		}
		System.out.println("Element does not found");
	}

}
