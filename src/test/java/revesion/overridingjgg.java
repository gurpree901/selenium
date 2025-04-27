package revesion;

class abc
{
	void m1()
	{
		System.out.println("this is m1 method..");
	}
}

class xyz extends abc
{
	void m1()
	{
		System.out.println("this is m2 method");
	}
}

class kkh extends abc
{
	void m1()
	{
		System.out.println("this is m3 method");
	}
}



public class overridingjgg {

	public static void main(String[] args) {
		xyz x=new xyz();
		x.m1();
		
		

	}

}
