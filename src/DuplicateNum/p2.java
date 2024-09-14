package DuplicateNum;

public class p2 {

	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,5,5,4,3,8,8};
		
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
			     if (num[i]==num[j]) {
					
			    	 System.out.println(num[i]);
				}
			}
		}
	}
}
