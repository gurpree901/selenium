package seleniumwebdriver;

public class revrsestring {

	public static void main(String[] args) {
		String str="guru";
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("revrse string:"+rev);
		
		
		

	}

}
