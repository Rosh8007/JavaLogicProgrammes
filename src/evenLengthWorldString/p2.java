package evenLengthWorldString;

public class p2 {

	public static void main(String[] args) {

		String str="India is my Country";

		String [] arr=str.split(" ");

		for (int i = 0; i < arr.length; i++) {

			if ((arr[i].length())%2==0) 
			{
				System.out.println(arr[i]);
			}
		}


	}
}
