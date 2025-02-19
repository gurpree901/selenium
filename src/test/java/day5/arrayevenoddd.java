package day5;

public class arrayevenoddd {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		System.out.println("even number in array");
		for( int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}

	}

}
