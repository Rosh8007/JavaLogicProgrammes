package NumMissing;

public class p2 {

	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,7};
		
		int smallest=arr[0];
		int largest=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (smallest>arr[i]) {
				
				smallest=arr[i];
			}
			else if(largest<arr[i]) 
			{
				largest=arr[i];
			}
			
			
		}
		System.out.println("Smallest :"+smallest);
		System.out.println("Largest :"+largest);
		
		
		
	}
}
