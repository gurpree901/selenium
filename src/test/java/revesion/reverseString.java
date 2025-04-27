package revesion;

public class reverseString {

	public static void main(String[] args) {
		String str="guru";
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string:"+rev);

	}

}
