package day28;

import java.util.Scanner;

public class palindromrevrse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		String rev="";
		int len=str.length();
		String org_str=str;
		
		
		for(int i=len-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println(rev);
		if(org_str.equals(rev))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("not palidnrome string");
		}
		
		

	}

}
