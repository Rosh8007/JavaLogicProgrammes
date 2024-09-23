package Inheritance;

class parent
{
	int x=12;
	
	public void m1() 
	{
		System.out.println("M1 of Parent");
	}
	
	public void m2() 
	{
		System.out.println("m2 of parent");
	}
}

class childs extends parent
{
	int y=33;
	
	
	public void m3() 
	{
		m1();
		System.out.println(x);
	}

}
public class Demo {

	public static void main(String[] args) {
		
		parent p=new parent();
		
		System.out.println(p.x);
		
		p.m1();
		p.m2();
		
		System.out.println("==================");
		
		childs ch=new childs();
		System.out.println(ch.x);
		System.out.println(ch.y);
		
		ch.m1();
		ch.m2();
		ch.m3();
		
	}

}
