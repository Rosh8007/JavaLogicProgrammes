package InterfaceDemo;

interface I1 {


	 int x=12;

	void m1();//abstract method
	
	default void m2() //default Method
	{
		System.out.println("m2 of Interface");
	}

	static void m3() //static method
	{
		System.out.println("M3 of Interface");
	}
}

class I2 implements I1
{

	public void m1() 
	{
		System.out.println("Implementation of abs method m1");
	}
    public void m4() 
	{
		System.out.println(x);
		System.out.println("M2 of Demo");
	}
}
public class Demo 
{

	public static void main(String[] args) {


		I2 d=new I2();
		d.m1();
		d.m2();
		d.m4();
	
		I1.m3();//only by class name not by,Object
		
		I1 i=new I2();
		i.m1();
		i.m2();
		
		
		System.out.println(i.x);

	}


}