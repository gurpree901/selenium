package seleniumwebdriver;

public class Reversestringkgg {

	public static void main(String[] args) {
		String str="guruingh";
		int len=str.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
