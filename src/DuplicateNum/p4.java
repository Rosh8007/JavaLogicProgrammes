package DuplicateNum;

import java.util.HashSet;
import java.util.Set;

public class p4 {
	
	public static void main(String[] args) {
		
		
		int [] arr= {13,12,11,11,12,13,14,15};
		
		
		Set<Integer>sData=new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(!sData.add(arr[i])) 
			{
				System.out.println("Duplicates :"+arr[i]);
			}
		}
		
		
		
	}

}
