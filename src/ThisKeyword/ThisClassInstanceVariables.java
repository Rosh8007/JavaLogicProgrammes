package ThisKeyword;

public class ThisClassInstanceVariables {
	
	
	//Let's prove that this keyword refers to the current class instance variable. 
	//In this program, we are printing the reference variable and this,
	//output of both variables are same.
	
	void m1() 
	{
		System.out.println(this);
	}
	
	
	public static void main(String[] args) {
		
		ThisClassInstanceVariables var=new ThisClassInstanceVariables();
		
		var.m1();
		System.out.println(var);
		
	}

}
