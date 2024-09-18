package Inheritance;

public class Child extends InheritanceDemo{

	@Override
	public  void m1() 
	{
		System.out.println("CHild m1 method");
		
	}

	@Override
	protected void m2() 
	{
		System.out.println("M2 of child");
	}

	@Override
	public Child m3() 
	{
		return null;
	}

	//	@Override
	//	public final void m4() 
	//	{
	//		System.out.println("M4 of Child");
	//	} we can not ovverride final method

	public static void main(String[] args) {

		Child c=new Child();
		c.m1();
		c.m2();
		c.m3();
		
		System.out.println("=======================");

		InheritanceDemo d=new Child();
		d.m1();
		d.m2();
		System.out.println(d.m3());
		d.m4();
		d.m5();

	}
}
