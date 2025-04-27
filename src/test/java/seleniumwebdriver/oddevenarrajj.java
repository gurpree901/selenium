package seleniumwebdriver;

public class oddevenarrajj {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		System.out.println("even numbers");
		for( int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
			else
			{
				System.out.println("odd");
			}
		}

	}

}
