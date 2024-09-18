package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(2);
		
		System.out.println(list);
		
		
		System.out.println("Get"+list.get(2));
		System.out.println(list.isEmpty());
		System.out.println(list.toString());
		list.add(1,21);
		
		
		

		System.out.println(list);
		Collections.sort(list);
		
		for(Object l:list) 
		{
			int i=(int)l;
			
			System.out.println(i);
		}
		
		  Iterator<Object> itr=list.iterator();
		  
		  while(itr.hasNext()) 
		  { 
			Object value=itr.next();
			System.out.println(value);
			  
		  }
	}

}
