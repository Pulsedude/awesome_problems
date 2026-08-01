package find_all_suffix;

import java.util.*;

class Solution {
    public List<String> findAllSuffix(String word) {
        List<String> suffix = new ArrayList<>();
        StringBuilder prev_chars = new StringBuilder();

        for (int i = word.length() - 1; i > 0; i--) {
            StringBuilder suffix_build = new StringBuilder();
            if (!prev_chars.isEmpty()) {
                suffix_build.append(prev_chars);
            }
            else {
                suffix_build.append(word.charAt(i));
            }
            prev_chars.append(word.charAt(i));
            suffix.add(suffix_build.reverse().toString());
        }
        suffix.add(prev_chars.reverse().toString());
        return suffix;
    }
}