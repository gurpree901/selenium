package seleniumwebdriver;

import java.util.Scanner;

public class revrsen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		/*int rev=0;
		/*while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}*/
		
		StringBuffer sf=new StringBuffer(String.valueOf(num));
		StringBuffer sf1=sf.reverse();
		StringBuilder sb=new StringBuilder();
		StringBuilder s=sb.reverse();
		
		System.out.println("reverse number :"+rev);

	}

}
