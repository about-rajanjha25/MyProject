package methods;

public class MethodOverLoad {

	static int max(int x,int y)
	{
		return x>y?x:y;
	}
	
	static float max(float x,float y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	
	public static void main(String[] args) {
		
		int c=max(6,7);
		System.out.println(c);
	}

}
