package conditional;

import java.util.Scanner;

public class TypeOfWebsite {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter url of the website");
		
		String url=sc.nextLine();
		sc.close();
		
		String protocol=url.substring(0, url.indexOf(":"));
		
		if(protocol.equals("http"))
		{
			System.out.println("Hypertext Transfer Protocol");
		}
		else if(protocol.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}
			
		String ext=url.substring(url.lastIndexOf(".")+1);
		
		if(ext.equals("com"))
		{
			System.out.println("It's a Commercial website");
		}
		else if(ext.equals("org"))
		{
			System.out.println("It's a Organisation website");
		}
		else if(ext.equals("net"))
		{
			System.out.println("It's a Network website");
		}
		else if(ext.equals("in"))
		{
			System.out.println("It's a Indian website");
		}
				
	}

}
