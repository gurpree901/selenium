package seleniumwebdriver;

public class Oddevenarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println("even number in array:");
		//for(int i=0;i<a.length;i++)
		/*{
			if(a[i]%2==0)
				System.out.println(a[i]);
			
				
			
		}*/
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		System.out.println("odd number in array:");
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}
		//for(int i=0;i<a.length;i++)
		/*{
			if(a[i]%2!=0)
				System.out.println(a[i]);
			
				
			
		}*/

		

	}

}
