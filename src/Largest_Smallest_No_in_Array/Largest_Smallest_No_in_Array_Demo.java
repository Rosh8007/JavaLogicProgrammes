package Largest_Smallest_No_in_Array;

public class Largest_Smallest_No_in_Array_Demo {
	
	
	
	public static void main(String[] args) 
	{
		
		
		int sum[]= {10,20,33,445,323,857,4848,238593,433333,-342};
		
		int smallest=sum[0];
		int largest=sum[0];
		
		for(int i=0; i<sum.length; i++) 
		{
			  if(sum[i]<smallest) 
			  {
				  smallest=sum[i];
			  }
			  else if(sum[i]>largest) 
			  {
				  largest=sum[i];
			  }
			  
			  
		}
		System.out.println("Smallest:"+smallest);
		  System.out.println("Largest:"+largest);

	}
}
