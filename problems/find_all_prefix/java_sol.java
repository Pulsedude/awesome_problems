package find_all_prefix;

import java.util.*;

class Solution {
    public List<String> findAllPrefix(String letter) {
        List<String> prefix = new ArrayList<>();
        StringBuilder prev_chars = new StringBuilder();

        for (int i = 0; i < letter.length(); i++) {
            StringBuilder str_build = new StringBuilder();
            if (!prev_chars.isEmpty()) {
                str_build.append(prev_chars);
            }
            else {
                str_build.append(letter.charAt(i));
            }
            prev_chars.append(letter.charAt(i));
            prefix.add(str_build.toString());
        }
        prefix.add(prev_chars.toString());
        return prefix;
    }
}