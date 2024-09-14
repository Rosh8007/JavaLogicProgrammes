package DuplicateNum;

import java.util.HashSet;
import java.util.Set;

public class p3 {

	
	
	public static void main(String[] args) {
	
		Set<Integer> s=new  HashSet<Integer>();
		
		for (int i=0; i<=5;i++) {
			
			s.add(i);
		}
		
		 System.out.println(s.toString());
	}
}
