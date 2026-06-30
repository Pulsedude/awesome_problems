package problems.valid_anagram;

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_char_arr = s.toCharArray();
        char[] t_char_arr = t.toCharArray();
        Arrays.sort(s_char_arr);
        Arrays.sort(t_char_arr);
        return Arrays.equals(s_char_arr, t_char_arr);
    }
}
