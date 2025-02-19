package seleniumwebdriver;

public class reversestring {
	
	public static String reversestring(String s)
	{
		return new StringBuilder(s).reverse().toString();
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println(reversestring("gurpreet"));

	}

}
