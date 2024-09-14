package DuplicateString;

import java.util.HashSet;
import java.util.Set;

public class DupString {

	public static void main(String[] args) 
	{


		String str="Roshan is Roshan's name";
		dup(str);

		String val  =Removeduplicates(str);
		System.out.println(val);

	}

	public static String Removeduplicates(String str) 
	{

		Set<Character> set=new HashSet<>();

		StringBuffer sbf=new StringBuffer();


		for(int i=0; i<str.length(); i++) 
		{

			char	cr=str.charAt(i);
			if(!set.contains(cr)) 
			{
				set.add(cr);
				sbf.append(cr);
			}

		}

		return sbf.toString();
	}


	public static void dup(String str) 
	{
		String s=str.replace(" ","");

		HashSet<Character>set=new HashSet<>();

		for(char c:s.toCharArray()) 
		{
			if(!set.add(c)) 
			{
				System.out.println("Duplicate :"+c);
			}
		}

		System.out.println(set);
	}

}
