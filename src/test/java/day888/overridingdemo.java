package day888;

class SBI
{
	double roi()
	{
		return 3.9;
		
	}
}


class Axis extends SBI
{
	double roi()
	{
		return 9.8;
		
	}
}


class ICICI extends SBI
{
	double roi()
	{
		return 5.8;
	}
}

public class overridingdemo {

	public static void main(String[] args) {
		SBI sb=new SBI();
		System.out.println(sb.roi());
		Axis ax=new Axis();
		System.out.println(ax.roi());
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
		
		

	}

}
