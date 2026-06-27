package custom_freq_counter;

import java.util.HashMap;

class Solution {
    public int count(String target_str, char character_to_count) {
        int total = 0;
        for (char i : target_str.toCharArray()) {
            if (i == character_to_count) {
                total += 1;
            }
        }
        return total;
    }

    public HashMap<Character, Integer> Counter(String target) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            counter.put(target.charAt(i), count(target, target.charAt(i)));
        }
        return counter;
    }
}

public class java_sol {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.Counter("yoyoo"));
    }
}
