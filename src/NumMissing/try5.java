package NumMissing;

import java.util.HashSet;
import java.util.Set;

public class try5 {
	
	public static void main(String[] args) {
		
		int a[]= {1,5,7,9};
		
		Set<Integer> hset=new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			hset.add(a[i]);
		}
		
	/*	 int max=Collections.max(hset);
		  int min=Collections.min(hset);
		  
		  for(int j=min; j<=max; j++) 
		  {
			  if(!hset.contains(j)) 
			  {
				  System.out.println(j);
			  }
		  }
		  */
		  //Approach 2
		  
		  int smallest=a[0];
		  int largest=a[0];
		  
		  for (int i = 0; i < a.length; i++) {
			
			  if (smallest>a[i]) {
				
				  smallest=a[i];
			  }
			  if (largest<a[i]) {
				largest=a[i];
			}
		}
		 
		for(int i=smallest; i<=largest; i++) 
		{
			if(!hset.contains(i)) 
			{
				System.out.println(i);
			}
			
		}
		  
		  
	}

}
