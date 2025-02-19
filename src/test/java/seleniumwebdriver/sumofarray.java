package seleniumwebdriver;

public class sumofarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum=0;
		//int len=a.length;
		
		/*for(int i=0;i<a.length;i++ )
		{
			sum=sum+a[i];
		}*/
		
		for( int value:a)
		{
			sum=sum+value;
		}
		System.out.println("sum of elemnt in araay:"+sum);

	}

}
