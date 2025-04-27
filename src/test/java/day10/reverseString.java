package day10;

public class reverseString {

	public static void main(String[] args) {
		String str="guru";
		int len=str.length();
		String rev="";
		/*for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}*/
		
		
		char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		
		System.out.println(rev);

	}

}
