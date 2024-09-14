package NumMissing;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class try4 {

	
	public static void main(String[] args) {
		
		int [] arr= {1,2,22};
		
		Set<Integer>hset=new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) 
		{
			hset.add(arr[i]);
		}
		
		int  max=Collections.max(hset);
		int min=Collections.min(hset);
		
		for(int i=min; i<=max; i++) 
		{
			if(!hset.contains(i)) 
			{
				System.out.println(i);
			}
		}
		
	}
}
