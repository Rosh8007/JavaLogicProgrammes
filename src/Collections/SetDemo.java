package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(7);
		set.add(2);
		set.add(5);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println(set);
	
	
		for(Integer s:set) 
		{
			System.out.println(s);
		}
		
		
		System.out.println("==========================================================");
	
	       Iterator<Integer>  itr=set.iterator();
	       while(itr.hasNext()) 
	       {
	    	  int  val=itr.next();
	    	  System.out.println(val);
	       }
	
	}
	
	
	

}
