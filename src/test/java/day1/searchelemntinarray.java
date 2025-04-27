package day1;

import java.util.Scanner;

public class searchelemntinarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter search number");
		int search_num=sc.nextInt();
		
		for(int i=0;i<=4;i++)
		{
			if(search_num==a[i])
			{
				System.out.println("element found");
				break;
			}
			
			
			
				
		}
		System.out.println("element not found");

	}

}
