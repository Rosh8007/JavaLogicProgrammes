package DuplicateNum;

public class p5 {


	public static void main(String[] args) {
		
		
		int arr[] = {1, 2, 3, 45, 6, 1, 2, 3};

	System.out.println("Duplicate elements are: ");

	for (int i = 0; i < arr.length; i++) {
		boolean isDuplicate = false;

		for (int j = i + 1; j < arr.length; j++)
		{
			if (arr[i] == arr[j]) {
				isDuplicate = true;
				break; 
			}
		}

		if (isDuplicate) {
			System.out.println(arr[i]);
		}
	}
	}

}
