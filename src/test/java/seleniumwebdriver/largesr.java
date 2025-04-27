package seleniumwebdriver;

import java.util.Scanner;

public class largesr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		System.out.println("ENTER FIRST NUMBER");
		int a=sc.nextInt();
		
		System.out.println("ENTER second NUMBER");

		int b=sc.nextInt();
		
		System.out.println("ENTER third NUMBER");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number");
			
		}
		else if(b>c && b>a)
		{
			System.out.println("b is largest number");
		}
		else
		{
			System.out.println("c is largest number");
		}



	}

}
