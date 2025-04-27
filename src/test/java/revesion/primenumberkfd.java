package revesion;

public class primenumberkfd {

	public static void main(String[] args) {
		String str="gurpreet";
		int len=str.length();
		String rev="";
		
		/*for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);*/
		
		char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}

		System.out.println(rev);
	}

}
