package switchCase;

import java.util.Scanner;

public class TypeOfWebsite {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter url of the website");
		
		String url=sc.nextLine();
		sc.close();
		
		String protocol=url.substring(0, url.indexOf(":"));
		
		switch(protocol)
		{
		case "http":System.out.println("It's Hypertext Transfer protocol");
					break;
		case "ftp":System.out.println("It's File Transfer Protocol");
					break;
		default:System.out.println("It's invalid protocol");
		
		}
		
		String ext=url.substring(url.lastIndexOf(".")+1);
		
		switch(ext)
		{
		case "com":System.out.println("It's a Commercial website");
					break;
		case "net":System.out.println("It's a Network website");
					break;
		case "org":System.out.println("It's a Organisational website");
					break;
		case "in":System.out.println("It's a Indian website");
					break;
		default:System.out.println("It's invalid website");
		
		}
	}

}
