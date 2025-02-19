package seleniumwebdriver;

import java.util.Scanner;

public class reversenumberg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();   //1234
		int rev=0;
		
		/*while(num!=0)
		{
			rev=rev*10+num%10; //1234
			num=num/10;
			
		}*/
		
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev1=sb.reverse();*/
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder num1=sb.reverse();
		
		System.out.println("reverse number:"+rev1);

	}

}
