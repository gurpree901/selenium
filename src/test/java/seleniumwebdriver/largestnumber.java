package seleniumwebdriver;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER");
		int num1=sc.nextInt();
		
		System.out.println("ENTER second NUMBER");
		int num2=sc.nextInt();
		
		System.out.println("ENTER third NUMBER");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3 )
		{
			System.out.println(num1+ "num1 is largest number");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+ "num2 is largest number");

		}
		else
		{
			System.out.println(num3+ "num 3is largest number");

		}


		
		



	}

}
