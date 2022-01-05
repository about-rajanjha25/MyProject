package methods;

public class MethodPractice2 {

	int max(int x, int y)
	{
		if(x>y)
			return x;
		else 
			return y;
	}
	
	public static void main(String[] args) {
		
		int a=10,b=15;
		MethodPractice2 mp=new MethodPractice2();
		System.out.println(mp.max(a, b));
	}

}
