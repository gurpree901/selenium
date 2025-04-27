package seleniumwebdriver;

public class reversewords {

	public static void main(String[] args) {
		String str="Welcome to java world";
		String string[]=str.split(" ");
		for(int i=string.length-1;i>=0;i--)
		{
			System.out.println(string[i]);
		}

	}

}
