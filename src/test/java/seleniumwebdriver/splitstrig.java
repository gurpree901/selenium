package seleniumwebdriver;

public class splitstrig {

	public static void main(String[] args) {
		String str="011-123456789";
		String[] s=str.split("-");
		
		

	}
	
	public void printstrin(String s[], String approach)
	{
		System.out.println("splitting string by using:"+approach);
		for( String value:s)
		{
			System.out.println(value);
		}
	}

}
