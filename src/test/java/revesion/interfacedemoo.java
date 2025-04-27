package revesion;

public class interfacedemoo {
	interface shape
	{
		int a=10;
		final int b=20;
		void m1(); //abstract method
		default void m2()
		{
			System.out.println("this is default m2 method...");
		}
		
		static void m3()
		{
			System.out.println("this is m2 static method..");
		}
	}
	
	
	public class shapees implements shape
	{
		void m4()
		{
			System.out.println("this is default m4 method");
		}

		@Override
		public void m1() {
			System.out.println("this m1 implemented method");
			
		}
		
		public void main(String[] args) {
			shapees s=new shapees();
			s.m1();
			s.m2();
			s.m4();
			System.out.println(s.a);
			
			shape s=new shapees();
			
			
			
			
			
			

		}
	}
	
	
	
	 
	
	
	
		
	
	
	

	
		
	
	
	

	}


