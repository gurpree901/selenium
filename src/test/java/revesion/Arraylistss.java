package revesion;

import java.util.ArrayList;
import java.util.List;

public class Arraylistss {

	public static void main(String[] args) {
		//ArrayList class
		ArrayList mylist=new ArrayList();
		//List interface
		//List my=new ArrayList();
		//ArrayList <Integer> mylist3=new ArrayList<Integer>();
		mylist.add(100);
		mylist.add("aman");
		mylist.add(null);
		mylist.add(true);
		mylist.add(null);
		mylist.add('H');
		System.out.println("all lists:"+mylist);
		//remove value
		mylist.remove(3);
		System.out.println("remove item:"+mylist);
		
		//insert
		mylist.add(3, "gurpreet");
		System.out.println("add itmes:"+mylist);
	

	}

}
