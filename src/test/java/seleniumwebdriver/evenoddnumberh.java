package seleniumwebdriver;

public class evenoddnumberh {

	public static void main(String[] args) {
		int num=123456;
		int even_count=0;
		int odd_count=0;
		
		while(num>1)
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
		System.out.println("number of even number:"+even_count);
		System.out.println("number of odd number:"+odd_count);

		

	}

}
