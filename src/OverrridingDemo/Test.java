package OverrridingDemo;

public class Test {
	
	
	public static void main(String[] args)throws Exception {
		
		
		ParentClass par=new ParentClass();
		par.name();
		par.salary();
		par.addr();
		par.MobileNo();
		System.out.println("===========================================");
		
		ParentClass rosh=new Roshan();
		rosh.name();
		rosh.salary();
		rosh.addr();
		rosh.MobileNo();
		System.out.println("===========================================");

		ParentClass tej=new Tejas();
		tej.name();
		tej.salary();
		tej.addr();
		tej.MobileNo();
		System.out.println("===========================================");

	}

}
