package seleniumwebdriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatescharacter {

	public static void main(String[] args) {
		String str="sanupatel";
		System.out.println(displayduplicates(str));

	}
	
	public static boolean displayduplicates(String str)
	{
		Map<Character,Integer> mymap=new HashMap<>();
		char[] ch=str.toCharArray();
		for(char c:ch)
		{
			if(!mymap.containsKey(c))
			{
				mymap.put(c,1);
			}
			else
			{
				mymap.put(c,mymap.get(c)+1);
			}
			
		Set<Map.Entry<Character,Integer>> entryset=mymap.entrySet();
		for(Map.Entry<Character, Integer> d:entryset)
		{
			if(d.getValue()>1)
			{
				System.out.println();
			}
		}
		}
		return true;
	}

}
