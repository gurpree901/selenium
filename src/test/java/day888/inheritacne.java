package day888;

class xyz
{
	int a=20;
	void m1()
	{
		System.out.println("this is m1 method");
	}
}

class ABC extends xyz
{
	int s=200;
	void m2()
	{
		System.out.println("this is m2 method");
	}
}






public class inheritacne {

	public static void main(String[] args) {
		ABC ch=new ABC();
		System.out.println(ch.s);
		ch.m1();
		ch.m2();
		System.out.println(ch.a);

	}

}
