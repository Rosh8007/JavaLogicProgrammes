package DuplicateNum;

import java.util.HashSet;
import java.util.Set;

public class Demo_Hash_Set {
	
	
	public static void main(String[] args) {
		
		String [] name= {"python","java","c","ruby","c"};
		
		Set<String> setdata=new HashSet<>();
		
		for(String names:name) 
		{
			if(setdata.add(names) == false) 
			{
				System.out.println("duplicate element:"+names);
			}
			else 
			{
				System.out.println("No Duplicate Found");
			}
		}
		
	}

}
