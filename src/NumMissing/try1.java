package NumMissing;

public class try1 {

	
	public static void main(String[] args) {
		
		
		int num[]= {1,2,3,5,6,7,8};
		
		int sum=0;
		for(int i=0; i<num.length; i++) 
		{
		     sum=sum+num[i];
		}
		
		
		int sum2=0;
		for (int i = 0; i <=8; i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println("Missing Number:"+(sum2-sum));
	}
}
