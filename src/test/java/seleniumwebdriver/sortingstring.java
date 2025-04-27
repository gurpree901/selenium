package seleniumwebdriver;

import java.util.Arrays;

public class sortingstring {

	public static void main(String[] args) {
		String str="gurpreet";
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		String sorted=new String(ch);
		System.out.println(sorted);

	}

}
