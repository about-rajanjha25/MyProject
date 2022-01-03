package udemy;

public class StringPractice2 {

	public static void main(String[] args) {
		String str1="Pyramid";
		
		String str2="pyramid";
		String str3=new String("Pyramid");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		System.out.println(str1.compareTo(str3));
		
		System.out.println(str1.contains("ra"));
	
	
	}

}
