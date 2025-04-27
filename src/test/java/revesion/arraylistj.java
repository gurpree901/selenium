package revesion;

import java.util.ArrayList;

public class arraylistj {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		mylist.add("aman");
		mylist.add(123);
		mylist.add(true);
		mylist.add("guru");
		mylist.add(33.5);
		mylist.add(null);
		System.out.println("all elelmnts:"+mylist);
		//After removing
		mylist.remove(4);
		System.out.println("after removing:"+mylist);
		
		//insert element
		mylist.add(3, "singh");
		System.out.println("after inserting values:"+mylist);
		
		
		

	}

}
