package DuplicateString;

import java.util.HashSet;

public class p1 {

	public static void main(String[] args) {

		String name="Roshan is my name";

		char[]  ch=name.replace(" ","").toCharArray();
//
//		HashSet<Character>hset=new HashSet<Character>();
//
//		for (char c : ch) {
//
//			if(!hset.add(c)) 
//			{
//				System.out.println("Duplicate found :"+c);
//			}
//
//		}
		
		
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				
				if (ch[i]==ch[j]) 
				{
					System.out.println(ch[i]);
				}
				
			}
		}
		

	}
}
