package seleniumwebdriver;

import java.util.HashMap;

public class hashmapj {

	public static void main(String[] args) {
		HashMap<Integer,String> mymap=new HashMap<Integer,String>();
		//Adding pairs
		mymap.put(101, "Guru");
		mymap.put(102, "aman");
		mymap.put(101, "guru");
		mymap.put(103, "siya");
		mymap.put(104, "rohit");
		System.out.println("all elemnts:"+mymap);
		System.out.println("size of hashmap:"+mymap.size());
		mymap.remove(103);
		System.out.println("after removing:"+mymap);
		
		//get all keys
		System.out.println(mymap.keySet());
		//values
		System.out.println(mymap.values());
		System.out.println(mymap.entrySet());
		
		for( int k:mymap.keySet())
		{
			System.out.println(k+"    "+mymap.get(k));
		}
		


	}

}
