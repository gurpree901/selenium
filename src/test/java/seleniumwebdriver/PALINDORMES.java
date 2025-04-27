package seleniumwebdriver;

import java.util.Scanner;

public class PALINDORMES {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		String or_str=str;
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i<=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		if(or_str.equals(str))
		{
			System.out.println("palindorme string");
		}
		else
		{
			System.out.println("not palindorme string");
		}
		
		
		
			
		

	}

}
