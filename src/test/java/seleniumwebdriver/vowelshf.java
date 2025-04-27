package seleniumwebdriver;

import java.util.Scanner;

public class vowelshf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		int count=0;
		
		for( char v:c)
		{
			switch (v)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				
			}
		}
		
		System.out.println("number of vowels :"+count);
			
		

	}

	
}
