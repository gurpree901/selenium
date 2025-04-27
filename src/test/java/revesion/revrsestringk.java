package revesion;

public class revrsestringk {

	public static void main(String[] args) {
		String str="guruhhhbhbhbhbhbkbhvh";
		int len=str.length();
		String rev="";
		
		/*for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string:"+rev);*/
		
		char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);

	}

}
