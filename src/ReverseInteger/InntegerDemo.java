package ReverseInteger;

public class InntegerDemo {


	public static void main(String[] args) {

		int num=1234;

		int rev=0;

		while(num!=0) 
		{
		   rev=rev*10+num%10;

			num=num/10;
		}

		System.out.println(rev);


		long num1=1234;

		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
