package NumMissing;


import java.util.Collections;
import java.util.HashSet;

public class approach2 {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,5,9,100};
		
		findmissingnum(arr);
	}

	private static void findmissingnum(int arr[])
	{
		HashSet<Integer> setdata=new HashSet<Integer>();
		
		for (Integer intarr : arr) 
		{
			setdata.add(intarr);
		}
		
		 int  max=Collections.max(setdata);
		 int min=Collections.min(setdata);
		 
		 for(int i=min; i<max; i++) 
		 {
			 if(!setdata.contains(i)) 
			 {
				 System.out.println("Missing Number is Found :===> "+i);
			 }
		 }
		
	}
}
