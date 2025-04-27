package day1;

import java.util.Arrays;

public class arraybb {

	public static void main(String[] args) {
		
		/*a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;*/
		
		int a1[]= {1,2,3,4,5,6};
		System.out.println(a1.length);
		System.out.println(a1[3]);
		System.out.println(a1[2]);
		
		System.out.println(Arrays.toString(a1));
		//normal forloop
		/*for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}*/
		
		for( int v:a1)
		{
			System.out.println(v);
		}

	}

}
