package ThisKeyword;

public class CallParameterizedFromDefault {
	
	
	int x;
	CallParameterizedFromDefault()
	{
		this(20);
		
		System.out.println("Default");
	}
	
	public CallParameterizedFromDefault(int x) 
	{
	    System.out.println(x);	
	    
	    System.out.println("Parameterised");
	}
	
	
	public static void main(String[] args) {
		
		CallParameterizedFromDefault pa=new CallParameterizedFromDefault();
		
	}
	
	

}
