package revesion;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap mymap=new HashMap();
		mymap.put(101, "guru");
		mymap.put(102, "aman");
		mymap.put(103, 112);
		mymap.put(104, true);
		mymap.put(105, 33.5);
		
		System.out.println("all elements:"+mymap);
		System.out.println(mymap.keySet());
		System.out.println(mymap.values());
		System.out.println(mymap.entrySet());

	}

}
