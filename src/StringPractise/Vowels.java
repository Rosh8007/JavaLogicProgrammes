package StringPractise;

public class Vowels {

    public static void main(String[] args) {
        String str = "Roshan";
        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            char c = Character.toUpperCase(ch[i]);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        System.out.println(count);
    }
}
