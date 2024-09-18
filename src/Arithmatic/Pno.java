package Arithmatic;

public class Pno {
	
	
	
	public static void main(String[] args) {
		
		
		
		int num=123;
		int count=0;
		
		
		for (int i = 1; i <=num; i++) 
		{
		    while(num%i==0) 
		    {
		    	count++;
		    } 
		}
		
		if (count==2)
	    {
	    	System.out.println("Prime no:");
		} 
		else
		{
			System.out.println("No is Not prime no:");
		}
	}

}
