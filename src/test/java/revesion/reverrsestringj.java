package revesion;

public class reverrsestringj {

	public static void main(String[] args) {
		String str="gurusingh";
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("revrse string:"+rev);

	}

}
