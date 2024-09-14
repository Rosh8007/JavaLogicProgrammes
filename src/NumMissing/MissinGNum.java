package NumMissing;

public class MissinGNum {
	
	
	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0; i<num.length; i++) 
		{
			 sum=sum+num[i];
		}
		
		System.out.println(sum);
		
		
		
		
		int sum2=0;
		for(int j=0; j<=10; j++) 
		{
			sum2=sum2+j;
		}
		
		System.out.println(sum2);
		
		
		System.out.println("Missing Number Is:"+(sum2-sum));
	}

}
