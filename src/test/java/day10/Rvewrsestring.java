package day10;

public class Rvewrsestring {

	public static void main(String[] args) {
		String str="Guru";
		int len=str.length();
		String rev="";
		/*for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}*/
		
		char[] c=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);

	}

}
