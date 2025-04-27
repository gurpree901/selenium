package day10;

import java.util.Scanner;

public class palinromstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		int len=str.length();
		String rev="";
		String org_str=str;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(org_str.equals(rev))
		{
			System.out.println("palinrome string");
		}
		else
		{
			System.out.println(" NOT palinrome string");

		}
		

	}

}
