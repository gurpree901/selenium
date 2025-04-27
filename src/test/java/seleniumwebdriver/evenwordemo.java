package seleniumwebdriver;

public class evenwordemo {

	public static void main(String[] args) {
		String str=" Hell wordls of jav";
		for( String s:str.split(" "))
		{
			if(s.length()%2==0)
			{
				System.out.println(s);
			}
		}

	}

}
