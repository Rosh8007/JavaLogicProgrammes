package Largest_Smallest_No_in_Array;

public class try2 {
	
	public static void main(String[] args) {
		
		int[] num=new int[] {1,2,7,89};
		
		int smallest=num[0];
		int largest=num[0];
		
		for(int i=0; i<num.length; i++) 
		{
			
			
				if(num[i]>largest) 
				{
					largest=num[i];
				}
				else if(num[i]<smallest) 
				{
					smallest=num[i];
				}
			
			
		}
		
		System.out.println("Largest :"+largest);
		System.out.println("Smallest :"+smallest);
	}

}
