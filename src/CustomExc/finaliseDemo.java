package CustomExc;

public class finaliseDemo {

	public void finalize() 
	{
		
		// finalise is the method
		System.out.println("Finalize Block");
	}
	
	public static void main(String[] args) {
		finaliseDemo fd=new finaliseDemo();
		   
		fd=null;
		
		System.gc();
	}
	
	
	String abc;
	
}
