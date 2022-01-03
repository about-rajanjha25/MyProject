package udemy;

public class StringPractice1 {

	public static void main(String[] args) {
		
		String str="Mr. Rajan Kumar Jha";
		System.out.println(str.startsWith("Mr"));
		System.out.println(str.startsWith("Rajan", 4));
		
		System.out.println(str.endsWith("Jha"));
		
		for(int i=0;i<str.length();i++)
		  //System.out.print(str.charAt(i));
		  System.out.println(str.charAt(i));
		
		String str1="www.udemy.co.in";
		
		System.out.println(str1.indexOf("."));
		System.out.println(str1.indexOf(".",4));
		
		System.out.println(str1.lastIndexOf("."));
	}

}
