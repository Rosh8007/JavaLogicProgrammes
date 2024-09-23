package InterfaceDemo;

interface In1
{
	int x=12;
	public void m1();
	public abstract void m2();
}

class In2 implements In1
{
	
	int y=33;
	
	@Override
	public void m1()
	{
		System.out.println("M1 of In2");
	}
	
	@Override
	public void m2() 
	{
		System.out.println("M2 of In2");
	}
	
	public void m3() {
	System.out.println("M3 of In2");
	}
	
}

public class p1
{
	public static void main(String[] args) {
		
		In2 i=new In2();
		i.m1();
		i.m2();
		i.m3();
		System.out.println(i.y);
		
		System.out.println("==============================");
		In1 ii=new In2();
		ii.m1();
		ii.m2();
		
		System.out.println(In1.x);
		
		
	}
}