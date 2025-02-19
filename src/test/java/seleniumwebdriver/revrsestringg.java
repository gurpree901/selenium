package seleniumwebdriver;

public class revrsestringg {

	public static void main(String[] args) {
		String str="Gurpreetsingh";
		String rev=" ";
		/*int len=str.length();
		for(int i= len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}*/
		char a[]=str.toCharArray();
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println("reverse string:"+rev);

	}

}
