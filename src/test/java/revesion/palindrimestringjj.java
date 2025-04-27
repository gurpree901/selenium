package revesion;

import java.util.Scanner;

public class palindrimestringjj {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		String rev="";
		String org_str=str;
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(org_str.equals(rev))
		{
			System.out.println("palidnrome string");
		}
		else
		{
			System.out.println("not palidnrome string");
		}

	}

}
