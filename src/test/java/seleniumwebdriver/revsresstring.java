package seleniumwebdriver;

public class revsresstring {

	public static void main(String[] args) {
		String str="gurpreet";
		String rev=" ";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string :"+rev);

	}

}
