package revesion;

import java.util.Scanner;

public class palidnroemestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		String org_str=str;
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(org_str.equals(rev))
		{
			System.out.println(org_str+"palindromestring");
		}
		else
		{
			System.out.println(org_str+"not palindrome string");
		}

	}

}
