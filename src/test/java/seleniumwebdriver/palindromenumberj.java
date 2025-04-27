package seleniumwebdriver;

import java.util.Scanner;

public class palindromenumberj {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	  int num=  sc.nextInt();
	  int rev=0;
	  int org_num=num;
	  
	  while(num!=0)
	  {
		rev= rev*10+ num%10;
		num=num/10;
	  }
	  	System.out.println(rev);
	  	if(org_num==rev)
	  	{
	  		System.out.println("palindrome number");
	  	}
	  	else
	  	{
	  		System.out.println("not palindrome number");
	  	}

	}

}
