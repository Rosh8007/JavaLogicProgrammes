package ReverseWords;

import java.util.Arrays;

public class Anagrams {


	public static void main(String[] args) 
	{

		String str1="roshan";
		String str2="nahsor";
		Boolean  ans=anagramCheck(str1, str2);

		System.out.println("Is Give Array Anagrams? :"+ans);
	}


	public static Boolean anagramCheck(String arry1, String arry2) 
	{

		char[] arr1 =arry1.toCharArray();
		char[]  arr2=arry2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);


		return Arrays.equals(arr1, arr2);
	}
}
