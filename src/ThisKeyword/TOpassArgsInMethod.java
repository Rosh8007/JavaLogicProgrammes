package ThisKeyword;

public class TOpassArgsInMethod {
	
	void m1(TOpassArgsInMethod s)
	{
		System.out.println("Method is invoked");
	}
	
	void m2()
	{
		  m1(this);  
	}
	
	public static void main(String[] args) {
		
		TOpassArgsInMethod pass=new TOpassArgsInMethod();
		pass.m2();
	}
}
