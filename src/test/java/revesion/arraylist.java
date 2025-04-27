package revesion;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		//List my=new ArrayList();
		mylist.add("1000");
		mylist.add("aman");
		mylist.add("10.5");
		mylist.add(null);
		mylist.add("aman");
		System.out.println("numbr of list:"+mylist);
		mylist.remove(3);
		System.out.println("after removing :"+mylist);
		mylist.add(2,'A');
		System.out.println("insert value:"+mylist);
		mylist.set(2, "java");
		System.out.println("replace element:"+mylist);
		
		//READING Specific elemnt from arraylist
		System.out.println("get specific value:"+mylist.get(2));
		//reading all values
		/*for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i)); 
		}*/
		
		//for each loop
		for(Object v:mylist)
		{
			System.out.println(v);
		}
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
