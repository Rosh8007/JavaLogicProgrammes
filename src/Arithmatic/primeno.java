package Arithmatic;

public class primeno {
	
	
	public static void main(String[] args) {
		
	int a=11;
	
	int count=0;
	
	for (int i = 1; i <=a; i++) 
	{
	     if (a%i==0) 
	     {
		    count++;	
		}	
	     
	     
	}
	
	if (count==2) {
   	 
   	 System.out.println("No is prime no");
		
	}
    else {
		System.out.println("no is not prime no");
	}
	
	
	
	
	}

}
