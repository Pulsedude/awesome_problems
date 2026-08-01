package find_prefix_and_suffix;

import java.util.*;

class Solution {
    public HashMap<String, List<String>> findPrefixandSuffix(String word) {
        HashMap<String, List<String>> result = new HashMap<>();
        List<String> prefix = new ArrayList<>();
        List<String> suffix = new ArrayList<>();

        StringBuilder prev_chars_for_prefix = new StringBuilder();
        StringBuilder prev_chars_for_suffix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            StringBuilder prefix_builder = new StringBuilder();
            if (!prev_chars_for_prefix.isEmpty()) {
                prefix_builder.append(prev_chars_for_prefix);
                prefix_builder.append(word.charAt(i));
            }
            else {
                prefix_builder.append(word.charAt(i));
            }
            prev_chars_for_prefix.append(word.charAt(i));
            prefix.add(prefix_builder.toString());
        }

        for (int j = word.length() - 1; j > 0; j--) {
            StringBuilder suffix_builder = new StringBuilder();
            if (!prev_chars_for_suffix.isEmpty()) {
                suffix_builder.append(prev_chars_for_suffix);
                suffix_builder.append(word.charAt(j));
            }
            else {
                suffix_builder.append(word.charAt(j));
            }
            prev_chars_for_suffix.append(word.charAt(j));
            suffix.add(suffix_builder.reverse().toString());
        }

        result.put("prefix", prefix);
        result.put("suffix", suffix);

        return result;
    }
}
