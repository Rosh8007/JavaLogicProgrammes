package NumMissing;

import java.util.HashSet;

public class try3 {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,5};
		
		int smallest=arr[0];
		int largest=arr[0];
		
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]<smallest) 
			{
				smallest=arr[i];
			}
			else if(arr[i]>largest) 
			{
				largest=arr[i];
			}
			
		}
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int ar:arr) 
		{
			set.add(ar);
		}
		
		for(int i=smallest; i<largest; i++) 
		{
			if(!set.contains(i)) 
			{
				System.out.print(i+",");
			}
			
		}
		
		
		
		
	}

}
