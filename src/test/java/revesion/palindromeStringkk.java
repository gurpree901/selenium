package revesion;

import java.util.Scanner;

public class palindromeStringkk {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	 String str= sc.nextLine();
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
		 System.out.println("palindrome string");
	 }
	 else
	 {
		 System.out.println("not palindorme string");
	 }
	 
	 
	 
	 

	}

}
