package Overriding;

public class C extends P {


	@Override
	public void m1() 
	{
		System.out.println("m1--C");
	}

	@Override
	public void m2() 
	{
		System.out.println("m2--C");
	}
	
	public void m3() {
		
		System.out.println("M3--C");
	}
}



