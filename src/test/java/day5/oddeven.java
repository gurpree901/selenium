package day5;

public class oddeven {

	public static void main(String[] args) {
		int num=123456;
		int odd_count=0;
		int even_count=0;
		
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
		}
		
		System.out.println("even numbers:"+even_count);
		System.out.println("odd numbers:"+odd_count);


	}

}
