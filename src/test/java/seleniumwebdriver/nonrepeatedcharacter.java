package seleniumwebdriver;

import java.util.LinkedHashMap;
import java.util.Map;

public class nonrepeatedcharacter {

	public static void main(String[] args) {

	}
	
	public static char getFirstNonrepeatedcharacter(String str)
	{
		Map<Character,Integer> count=new LinkedHashMap<Character,Integer>();
		for(char ch:str.toCharArray())
		{
			count.put(ch,count.containsKey(ch) ? count.get(ch)+1:1) 
		}
		For (Entry <Character,Integer> entry :count.entrySet())
		{
			if(E)
		}
		
		
		return 0;
		
	}

}
