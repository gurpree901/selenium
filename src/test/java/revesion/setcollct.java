package revesion;

import java.util.HashSet;

public class setcollct {

	public static void main(String[] args) {
		HashSet myset=new HashSet();
		myset.add(100);
		myset.add("guru");
		myset.add("true");
		myset.add('J');
		myset.add("guru");
		myset.add(33.9);
		
		System.out.println("all set:"+myset);
		
		//removing data
		myset.remove("guru");
		System.out.println("after removing:"+myset);

	}

}
