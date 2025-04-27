package seleniumwebdriver;

import java.util.Arrays;

public class Anagramstring {

	public static void main(String[] args) {
		String str1="java";
		String str2="avaj";
		System.out.println("both string are anagramcheck:"+anagramcheck(str1,str2));

	}
	
	public static boolean anagramcheck(String str1,String str2)
	{
		char[] chararrayfromstring1=str1.toCharArray();
		char[] chararrayfromstring2=str2.toCharArray();
		Arrays.sort(chararrayfromstring1);
		Arrays.sort(chararrayfromstring2);
		
		
		return Arrays.equals(chararrayfromstring1, chararrayfromstring2);
		
	}

}
