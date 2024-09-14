package NumMissing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class p1 {


	public static void main(String[] args) {


		int arr[]= {1,2,4,5,10};


		List<Integer>list=new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) 
		{
			list.add(arr[i]);
		}

		int	max=Collections.max(list);
		int	min=Collections.min(list);

		for (int i = min; i < max; i++) {
			
			if (!list.contains(i)) {
				
				System.out.println(i);
			}
		}


	}
}
