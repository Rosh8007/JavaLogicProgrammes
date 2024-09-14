package Largest_Smallest_No_in_Array;

public class try3 {
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,2,1,1,3,32};
		
		int smallest=a[0];
		int largest=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(smallest>a[i]) 
			{
				smallest=a[i];
			}
			if(largest<a[i]) 
			{
				largest=a[i];
			}
			
		}
		
		System.out.println("Smallest :"+smallest);
		System.out.println("Largest :"+largest);
		
	}

}
