package NumMissing;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class try2 {

	public static void main(String[] args) {

		int[] arr=new int[] {1,2,3,5};
		missingNo(arr);
	}

	public static void missingNo(int []num) 
	{
		HashSet<Integer>has=new HashSet<Integer>();

		for(int nu:num) 
		{
			has.add(nu);
		}
		int  max=Collections.max(has);

		int	min=Collections.min(has);

		for(int i=min; i<max; i++) 
		{
            if(!has.contains(i)) 
            {
            	System.out.println("Missing No "+i);
            }
		}


	}

}
