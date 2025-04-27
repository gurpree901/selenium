package revesion;

public class Stringsrevrse {

	public static void main(String[] args) {
		String str="Gurpreet";
		int len=str.length();
		String rev="";
		/*for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}*/
		
		char[]ch=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		
			
		
		System.out.println(rev);

	}

}
