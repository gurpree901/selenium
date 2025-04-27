package seleniumwebdriver;

import java.util.Scanner;

public class countnumberofwords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		String str=sc.nextLine();
		int count=countnumberofword(str);
		System.out.println("number of words:"+count);

	}

	private static int countnumberofword(String str) {
		int count=0;
		if(str.charAt(count)!=' ')
		{
			count++;
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)==' ')
			{
				count++;
			}
		}
		return count;
		
	}

}
