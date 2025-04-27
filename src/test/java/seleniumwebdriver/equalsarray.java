package seleniumwebdriver;

import java.util.Arrays;

public class equalsarray {

	public static void main(String[] args) {
		int a1[]= {1,2,4,4,5};
		int b1[]= {1,2,3,4,5};
		boolean status=Arrays.equals(a1, b1);
		if(status=true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}

	}

}
