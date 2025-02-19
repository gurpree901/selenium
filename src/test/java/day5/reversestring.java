package day5;

public class reversestring {

	public static void main(String[] args) {
		String str="siyabcha";
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string:"+rev);
	
		
	}

}
