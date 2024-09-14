package evenLengthWorldString;

public class p1 {

	public static void main(String[] args) {


		String str="Roshan is my named";

		String[]  ch=str.split(" ");

		for(String c:ch) 
		{
			

			if (c.length()%2==0) {

				System.out.println(c);
			}
		}




	}
}
