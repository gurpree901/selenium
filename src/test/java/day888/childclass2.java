package day888;

public class childclass2 implements interface1,interface2 {
	
	@Override
	public void m2() {
		System.out.println("this is m2 method..");
	}

	@Override
	public void m1() {
		System.out.println("this is m1 method..");
	
		
	
}

	public static void main(String[] args) 
	{
		childclass2 ch=new childclass2();
		ch.m2();
		ch.m1();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
		

	
	
}
