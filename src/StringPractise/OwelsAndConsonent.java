package StringPractise;

public class OwelsAndConsonent {

	public static void main(String[] args) {



		String str="Amravati";
		
		int owelcount=0;
		
		int consonantCount=0;

		char[]  c =str.toCharArray();

		for (int i = 0; i < c.length; i++) {

			char	ch= Character.toUpperCase(c[i]);
			
			if (ch=='A'|ch=='E'|ch=='I'|ch=='O'|ch=='U')
			{
                owelcount++;
			}
			else {
				consonantCount++;
			}
		}
		
		System.out.println("OwelCount :"+ owelcount);
		System.out.println("Consonat Count :"+ consonantCount);

	}

}
