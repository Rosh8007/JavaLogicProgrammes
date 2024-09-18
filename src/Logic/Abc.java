package Logic;

public class Abc {
	
	


	public static void main(String args[])
	{

	int num=12;

	int count=0;

	for(int a=1;a<=num;a++)
	{

	while(num%a==0)
	{

	   count++;
	}

	}

	if(count==2)
	{
	System.out.println("No is prime no");
	}

	else
	{
	System.out.println("No is not prime no");
	}

	}
	}


