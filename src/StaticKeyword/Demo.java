package StaticKeyword;

import java.util.Arrays;

public class Demo {

	//Static keyword creat saperate copy of memory share across all objects
	//Makes updation and modification of variables easy
	//we cn then access static members using class name,or directly in case of same class


	static int  x=12;
	int y=9;

	static void m1() 
	{
		System.out.println("Static method m1");
	}

	void m2() 
	{
		System.out.println(x);

		System.out.println("Non Static Method m2");
	}


	public static void main(String[] roshan) {

		Demo d=new Demo();
		System.out.println(d.y);
		d.m2();

		System.out.println(x);
		Demo.m1();

	}

}
