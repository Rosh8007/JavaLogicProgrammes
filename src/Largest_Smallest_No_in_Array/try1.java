package Largest_Smallest_No_in_Array;

import java.util.Collections;
import java.util.HashSet;

public class try1 {
	
	public static void main(String[] args) {
		
		int[] arr=new int[] {1,-2,74,23,35};
		
		
		
		  int  smallest=arr[0];
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
		
		System.out.println("Smallest :->"+smallest);
		System.out.println("Largest :->"+largest);
		
		app2(arr);
	}
	
	public static void app2(int [] arr) 
	{
		HashSet<Integer> set=new HashSet<>();
		
		for(int ar:arr) 
		{
			set.add(ar);
		}
		
		 int  max=Collections.max(set);
		 int  min=Collections.min(set);

		 System.out.println(max);
		 System.out.println(min);
		 
		 for(int i=min; i<max; i++) 
		 {
			 if(!set.contains(i)) 
			 {
				 System.out.print(i+",");
			 }
		 }
	}

}
