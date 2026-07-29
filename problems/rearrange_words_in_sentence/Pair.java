package problems.rearrange_words_in_sentence;

import java.util.*
;
public class Pair<L, I, W> {
    L length;
    I index;
    W word;

    Pair(L length, I index, W word) {
        this.length = length;
        this.index = index;
        this.word = word;
    }

    @Override
    public String toString() 
    {
        return "(" + this.length + "," + this.index + "," + this.word + ")";
    }
}

class Solution {
    public ArrayList<Pair<Integer, Integer, String>> get_words_length(String[] text_arr) {
        ArrayList<Pair<Integer, Integer, String>> pairs = new ArrayList<>();
        for (int i = 0; i < text_arr.length; i++) {
            pairs.add(new Pair(text_arr[i].length(), i, text_arr[i]));
        }
        return pairs;
    }

    public String arrangeWords(String text) {
        String[] text_arr = text.split("\\s+");
        ArrayList<Pair<Integer, Integer, String>> words_with_length = get_words_length(text_arr) ;

        words_with_length.sort(
                Comparator
                        .comparingInt((Pair<Integer, Integer, String> p) -> p.length)
                        .thenComparingInt(p -> p.index)
        );

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words_with_length.size(); i++) {
            String Word = words_with_length.get(i).word;
            if (i > 0) {
                result.append(" " + Word.toLowerCase());
            }
            else {
                result.append(Word.substring(0, 1).toUpperCase() + Word.substring(1));
            }
        }
        return result.toString();
    }
}