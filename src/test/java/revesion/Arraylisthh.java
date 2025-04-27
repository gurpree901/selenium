package revesion;

import java.util.ArrayList;

public class Arraylisthh {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		mylist.add("aman");
		mylist.add(100);
		mylist.add(true);
		mylist.add(23.8);
		mylist.add("aman");
		mylist.add(null);
		mylist.add(null);
		
	//print all data 
		System.out.println("all data:"+mylist);
		
		mylist.add(2, "gurpreet");
		System.out.println("after adding element:"+mylist);
		
		mylist.remove(4);
		System.out.println("after removing:"+mylist);
		
		
		

	}

}
