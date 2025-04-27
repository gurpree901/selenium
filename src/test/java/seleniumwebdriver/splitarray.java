package seleniumwebdriver;

public class splitarray {

	public static void main(String[] args) {
             String str="Hello World";
             count(str);
	}
	
	
	public static  void count(String str)
	{
		char[] a=str.toCharArray();
		 for(int i=0;i<a.length;i++)
		 {
			 String s= "";
			 
			 while(i<a.length && a[i]!=' ')
			 {
				 s=s+a[i];
				 i++;
				 
			 }
			 if(s.length()>0)
				 System.out.println(s+ "->" + s.length());
		 }
	}

}
