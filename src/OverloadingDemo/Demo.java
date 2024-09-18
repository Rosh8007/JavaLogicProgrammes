package OverloadingDemo;

public class Demo {



	public long add(long x, long y) 
	{
		return x+y;
	}

	public int add(int x, int y) 
	{
		return  x+y;
	}
	
	public void add() 
	{
		System.out.println("Simple Addition Method");
	}

	public static void add(String s) 
	{
	    System.out.println(s);	
	}

	public static void main(String[] args) {

		Demo d=new Demo();
		long lsum=d.add(202020202l, 21813l);
		int   intsum=d.add(2, 10);
	
		
		
		d.add();
		add("Static method");


		System.out.println(lsum);
		System.out.println(intsum);
	}
}
