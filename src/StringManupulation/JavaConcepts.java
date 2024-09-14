package StringManupulation;

public class JavaConcepts {
	
	
	// Explaination is when variable is declared final then static block is not executed
	// when variable is not declared final then static block is not  executed.

	public static void main(String[] args)
	{
		System.out.println(main.x);
	}
}

class main
{
	
  public static final int x=100;
  
  static 
  {
	  System.out.println("Static Block");
  }

}
