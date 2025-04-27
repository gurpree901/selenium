package seleniumwebdriver;

import java.util.HashSet;
import java.util.Set;

public class duplicatstring {

	public static void main(String[] args) {
		String str="sanupatelp";
		System.out.println(removeduplicate(str));
		

	}
	
	public static StringBuffer removeduplicate(String str)
	{
		Set<Character> set=new HashSet<>();
		StringBuffer  sf=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
		}
		sf.toString();
		return sf;
	}

}
