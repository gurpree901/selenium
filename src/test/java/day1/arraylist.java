package day1;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList mylisty=new ArrayList();
		mylisty.add("Aman");
		mylisty.add(200);
		mylisty.add(true);
		mylisty.add(20.8);
		mylisty.add(null);
		mylisty.add("GURU");
		System.out.println("print all elements:"+mylisty);
		mylisty.add(3, "siyabcha");
		System.out.println("after inserting elements:"+mylisty);
	}

}

