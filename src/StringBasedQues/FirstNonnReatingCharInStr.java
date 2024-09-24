package StringBasedQues;

public class FirstNonnReatingCharInStr {


	public static void main(String[] args) {

		String str = "swiss";
		boolean found = false;

		for (int i = 0; i < str.length() && !found; i++) {
			boolean isUnique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println("First non-repeating letter: " + str.charAt(i));
				found = true;
			}
		}

		if (!found) {
			System.out.println("No non-repeating letter found.");
		}}


}
