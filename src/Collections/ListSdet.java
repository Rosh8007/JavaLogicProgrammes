package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSdet {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		// 3 ways to get all data from List
		System.out.println("=============Using For loops==================");
		for(int i=0; i<=list.size()-1;i++) 
		{
			System.out.println(list.get(i));
		}
		System.out.println("================Using For Each Loop===================");
		
		for(Integer l:list) 
		{
			System.out.println(l);
		}
		
		System.out.println("=================Using Iterator and while Loop=================");
	
	         Iterator<Integer>   itr=list.iterator();
	         while(itr.hasNext()) 
	         {
	        	 System.out.println(itr.next());
	         }
	         
	     //Use of remove all Method
	         
	         List<Integer> remove=new ArrayList<Integer>();
	         remove.add(100);
	         remove.add(200);
	         
	         list.removeAll(remove);
	         
	         System.out.println(list);
	
	
	}

}
