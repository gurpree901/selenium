package day5;

public class reversestrinhjj {

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
		
		System.out.println("revrse String :"+rev);

	}

}
