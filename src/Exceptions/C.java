package Exceptions;

import java.io.FileNotFoundException;

public class C extends P{


	public void cm1() throws FileNotFoundException 
	{
		m1();
	}

	public void cm2() 
	{
		m2();
	}
	class Test
	{

		public static void main(String[] args) {
                
			C c=new C();
			
			
			try {
				c.cm1();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
			
			
			c.m2();
		}

	}
}
