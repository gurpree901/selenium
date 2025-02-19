package seleniumwebdriver;

import java.util.Scanner;

public class reversenumberj {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;   //1234456
			num=num/10;
		}
		
		System.out.println("reverse number :"+rev);
	   

		
	}

}
