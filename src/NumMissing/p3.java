package NumMissing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class p3 {

	public static void main(String[] args) {



		int arr[]= {1,2,3,5,6,7,9,15,20};


		List<Integer>list=new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			list.add(arr[i]);

		}

		int	max=Collections.max(list);
		int	min=Collections.min(list);

		System.out.println(max+":"+min);

		for (int i = min; i < max; i++) 
		{
			if (!list.contains(i)) {

				System.out.println("Missing Number :"+i);
			}
		}
	}

}
