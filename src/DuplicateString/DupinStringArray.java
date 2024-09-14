package DuplicateString;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DupinStringArray {
	
	
	public static void main(String[] args) {
		
		
		String strArr[]= {"Roshan","Roshan","Tejas","Deep","Dhanu","Deep"};
		
		dupFinder(strArr);
		dupfinderAppr2(strArr);
		dupFinderApproach3(strArr);
		
		
	}

	
	//Approach 1
	public static void dupFinder(String a[]) 
	{
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]==a[j]) {
					
					System.out.println(a[i]);
				}
			}
		}
	}
	
	
	//Approach2
	public static void dupfinderAppr2(String a[]) 
	{
		System.out.println("==================================");
		
		Set<String> set=new HashSet<String>();
		
		for (int i = 0; i < a.length; i++) {
			
			
			
			if (!set.add(a[i])) {
				
				System.out.println("Duplicate String  :" + a[i]);
			}
		}	
		
		System.out.println("=====================================");
	}
	
	//Approach 3
	
	public static void dupFinderApproach3(String a[]) 
	{
		
	}
	
}
