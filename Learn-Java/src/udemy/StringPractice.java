package udemy;

public class StringPractice {

	public static void main(String[] args) {
		
	/*	String str1="Java Program";
		
		String str2=new String("Java");
		char c[]= {'H','e','l','l','o'};
		
		String str3=new String(c);
		
		byte b[]= {65,66,67,68,69};
		
		String str4=new String(b,1,3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4); */
		
		String str=new String("netbeans");
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		
		String str1=new String("  netbeans  ");
		
		System.out.println(str1);
		str = str1.trim();
		System.out.println(str);
		
		String str2=str.substring(2);
		System.out.println(str2);
		
		String str3=str.substring(2,4);
		System.out.println(str3);
		
		String str4=str.replace('e', 'M');
		System.out.println(str4+" "+str);
		
	}

}
