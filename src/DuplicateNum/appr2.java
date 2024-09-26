package DuplicateNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class appr2 {
	public static void main(String[] args) {


		int arr[]= {1,32,11,42,42,22,11,32};

		List<Integer>list=new ArrayList<Integer>();

		for(int i=0; i<arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]==arr[j]) 
				{
					list.add(arr[i]);
				}
			}

		}

		Object[]  intarr=list.toArray();
		
		System.out.println(Arrays.toString(intarr));
		

	}
}
