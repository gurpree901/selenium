package seleniumwebdriver;

public class sumofdigits {

	public static void main(String[] args) {
		int num=4449449;
		int sum=0;
		while(num>1)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum of digit:"+sum);

	}

}
