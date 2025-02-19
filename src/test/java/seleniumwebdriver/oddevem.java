package seleniumwebdriver;

public class oddevem {

	public static void main(String[] args) {
		int num=1234567890;
		int even_count=0;
		int odd_count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			
			num=num/10;
				
		}
		
		System.out.println("evencount:"+even_count);
		System.out.println("odd count :"+odd_count);


	}

}
