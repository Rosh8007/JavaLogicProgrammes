package DuplicateNum;

import java.util.HashSet;
import java.util.Set;

public class p1 {

	public static void main(String[] args) {

		int arr[]= {1,32,11,42,42,22,11,32};

		Set<Integer>hset=new HashSet<Integer>();

		for(int i=0; i<arr.length; i++) 
		{
			if(!hset.add(arr[i])) 
			{
				System.out.println(arr[i]);
			}
		}

		System.out.println("========================================");
		//Approach 2: 

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i]==arr[j]) {
					
					System.out.println("Match found"+arr[i]);
				}
			}
		}
		
		System.out.println("========================================");
		
		//Approach3:
		
		for (int i = 0; i < arr.length; i++) {
			 
			for (int j = i+1; j < arr.length; j++) {
				
				  if (arr[i]==arr[j]) {
					
					  System.out.println(arr[i]);
				}
			}
		}

	}

}
