package revesion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylisyhh {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		List my=new ArrayList();
		mylist.add("Aman");
		mylist.add(100);
		mylist.add('S');
		mylist.add(null);
		mylist.add("Aman");
		mylist.add(true);
		mylist.add(133.4);
		
		System.out.println("all list:"+mylist);
		
		//remove specific vlue
		mylist.remove(3);
		System.out.println("After removing:"+mylist);
		
		//Add specific value
		mylist.add(3,"gurpreet");
		System.out.println("After adding:"+mylist);
		
		//for each loop
		for(Object value:mylist)
		{
			System.out.println(value);
		}
		
		Iterator it=mylist.iterator();
		while(true)
		{
			it.hasNext();
		}

	}

}
