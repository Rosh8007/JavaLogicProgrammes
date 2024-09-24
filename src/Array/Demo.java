package Array;

public class Demo {


	//arr = [1, 2, 3, 4, 5, 6], target = 7

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6};

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]+arr[j]==7) {
				
					System.out.println("Combination  "+arr[i]+":"+arr[j]);
				}
			}
		}
	}

}
