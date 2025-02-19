package seleniumwebdriver;

public class reversstring {

	public static void main(String[] args) {
		String str="singhgurpreet";
		int len=str.length();
		String rev=" ";
		/*for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i); 
		}*/
		
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		
		System.out.println("reverse string:"+rev);

	}

}
