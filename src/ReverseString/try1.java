package ReverseString;

public class try1 {

	public static void main(String[] args) {


		String str="My Name Is Roshan";

		String   words[]=str.split(" ");
		
		System.out.println(words.length);
		
		for (int i = words.length-1; i >=0; i--) {
			
			System.out.println(words[i]);
		}


	}

}
