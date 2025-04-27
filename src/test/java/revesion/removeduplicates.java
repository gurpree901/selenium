package revesion;

import java.util.HashSet;
import java.util.Set;

public class removeduplicates {

	public static void main(String[] args) {
		String str="Amanaa";
		System.out.println(removeduplicates(str));

	}
	
	public   static String removeduplicates(String str)
	{
		Set<Character> myset=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(!myset.contains(c))
			{
				myset.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
		
	}

}
