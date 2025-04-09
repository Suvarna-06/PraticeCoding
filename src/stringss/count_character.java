package stringss;

public class count_character {

        public static void main(String[] args) {
            String word = "apple";

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int count = 0;

                // Check if we already counted this character
                boolean alreadyCounted = false;
                for (int j = 0; j < i; j++) {
                    if (word.charAt(j) == ch) {
                        alreadyCounted = true;
                        break;
                    }
                }

                if (!alreadyCounted) {
                    // Count how many times this character appears
                    for (int k = 0; k < word.length(); k++) {
                        if (word.charAt(k) == ch) {
                            count++;
                        }
                    }
                    System.out.println(ch + " = " + count);
                }
            }
        }
}
