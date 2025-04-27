package revesion;

import java.util.ArrayList;

public class arraylistfj {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		mylist.add("aman");
		mylist.add("guru");
		mylist.add(122);
		mylist.add(null);
		mylist.add(true);
		mylist.add(23.4);
		System.out.println(mylist);
		
		mylist.remove(4);
		System.out.println("after removing:"+mylist);

	}

}
