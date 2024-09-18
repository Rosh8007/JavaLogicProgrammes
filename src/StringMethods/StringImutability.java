package StringMethods;

import java.util.Arrays;

public class StringImutability {

	
	public static void main(String[] args) {
		
		String s="Welcome";
		
		System.out.println(s);//Welcome
		
		s.concat("to java");//String is immutable in java thats why no change in original value
		
		System.out.println(s);//Welcome
		
		
		
		StringBuffer sbfr=new StringBuffer("Welcome");
		sbfr.append("to java");//it changed original value thats why it it mutable
		System.out.println(sbfr);
		
		StringBuilder sbuild=new StringBuilder("Welcome");
		sbuild.append("to Selenium");
		System.out.println(sbuild);
		
		String arr[]= {"a","zks","sksk"};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
}
