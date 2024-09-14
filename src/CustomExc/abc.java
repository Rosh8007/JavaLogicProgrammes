package CustomExc;

public class abc {
	
	
	
	public static void test1() 
	{
		 
	
		
		try 
		{
			System.out.println("Try block Started");
			
			throw new ArithmeticException("Custom Made Arithmatic Exception");
		} 
		catch (ArithmeticException |NullPointerException e) 
		{
			System.out.println("Catch block Started");
			e.printStackTrace();
		}
		
		finally 
		{
			System.out.println("Finally Block");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		test1();
		
	}

}
