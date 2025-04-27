package seleniumwebdriver;

public class removespaces {

	public static void main(String[] args) {
		removespaces("abcd  ef gh jj");

	}
	
	public static void  removespaces(String str)
	{
		for( char ch:str.toCharArray())
		{
			if(ch!=' ')
			{
				System.out.print(ch);
			}
		}
	}

}
