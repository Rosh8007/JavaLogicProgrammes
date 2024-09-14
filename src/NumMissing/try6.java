package NumMissing;

import java.util.HashSet;
import java.util.Set;

public class try6 {



	public static void main(String[] args) {

		Set<Integer>set=new HashSet<Integer>();

		int arr[]= {1,2,3,4,6,11,12,15,17};

		int smallest=arr[0];
		int largest=arr[0];


		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);

			if (smallest>arr[i])
			{
				smallest=arr[i];
			}
			if (largest<arr[i]) {
				largest=arr[i];
			}
		}

		for (int i = smallest; i < largest; i++) {

			if (!set.contains(i)) {

				System.out.println(i);
			}
		}


	}
}
