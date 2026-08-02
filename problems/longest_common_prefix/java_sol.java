package problems.longest_common_prefix;

import java.util.*;

// Solution: 2 ------------------------------------
class Solution {
    public String longestCommonPrefix(List<String> strs) {
        String first_letter = strs.getFirst();
        StringBuilder current_lcp = new StringBuilder("");

        for (int i = 1; i < strs.size(); i++) {
            int p1 = 0;
            int p2 = 0;
            StringBuilder lcp_builder = new StringBuilder();
            
            while (i > 1 ? (p1 < current_lcp.length() && p2 < strs.get(i).length()) : (p1 < first_letter.length() && p2 < strs.get(i).length())) {
                if (i > 1 ? (current_lcp.charAt(p1) == strs.get(i).charAt(p2)) : (first_letter.charAt(p1) == strs.get(i).charAt(p2))) {
                    lcp_builder.append(strs.get(i).charAt(p2));
                }
                else {
                    break;
                }
                p1++;
                p2++;
            }
            current_lcp = lcp_builder;
        }
        return current_lcp.toString();
    }
}
