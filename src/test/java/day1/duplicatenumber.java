package day1;

public class duplicatenumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,1,2,4,5,1};
		int num=1;
		int count=0;
		
		for(int v:a)
		{
			if(v==num)
			{
				count++;
			}
		}
		
		System.out.println("number of times repeated:"+count);

	}

}
