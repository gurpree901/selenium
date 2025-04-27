package revesion;

public class Reversestringj {

	public static void main(String[] args) {
		String str="gurpreet";
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
