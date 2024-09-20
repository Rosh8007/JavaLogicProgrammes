package Exceptions;

import java.io.FileNotFoundException;

public class MultipleCatchBlock {
	
	
	
	public static void m1() 
	{
		
		
		try {
			
			
		//	throw new ArithmeticException("Arithmatic exception is created");
			
			int x=10/0;
			
			System.out.println(x);
			
			throw new FileNotFoundException("File not found exception created");
			
			
		} 
		
		
		//Approach 1
	/*catch (ArithmeticException e) {
			
			e.printStackTrace();
		}	
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	*/
		// Approch 2
	
		// Note: Exception Hierarchy should be followed carefully
		catch (IndexOutOfBoundsException|ArithmeticException | FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
		
	
	
	
	
	}
	
	public static void main(String[] args) {
		
		
		m1();
	}
}
