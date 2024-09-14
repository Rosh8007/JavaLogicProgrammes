package StringBasedQues;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStrngWithowtRepeatation 
{
	
	public static void main(String[] args)
	{
		
		String s="bbbb";

		int start=0;
		int end=0;
		int max_length=0;
		
		List<Character> list=new ArrayList<Character>();
		
		while(end<s.length()) 
		{
			if(!list.contains(s.charAt(end))) 
			{
				list.add(s.charAt(end));
				
				max_length =Math.max(max_length, list.size());
				
				end++;
			}
			else 
			{
				list.remove(Character.valueOf(s.charAt(start)));
			}
		}
		
		System.out.println("Maximum Length "+max_length);
		
	}
	


}
	

