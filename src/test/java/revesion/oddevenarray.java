package revesion;

public class oddevenarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("even array:");
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}

	}

}
