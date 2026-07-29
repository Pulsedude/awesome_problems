package maximum_number_of_words_you_can_type;

import java.util.*;

class CoolSolution {
    public int canBeTypeWords(String text, String brokenLetters) {
        String[] text_arr = text.split(" ");
        TreeSet<Character> brokenLetters_set = new TreeSet<>();

        // adding all brokenLetters into brokenLetters_set (treeset)
        for (int i = 0; i < brokenLetters.length(); i++) {
            brokenLetters_set.add(brokenLetters.charAt(i));
        }

        int cannot_type = 0;

        for (String letter: text_arr) {
            for (int j = 0; j < letter.length(); j++) {
                if (brokenLetters_set.contains(letter.charAt(j))) {
                    cannot_type++;
                    break;
                }
            }
        }
        return text_arr.length - cannot_type;
    }
}
