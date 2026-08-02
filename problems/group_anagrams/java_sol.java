package group_anagrams;

import java.util.*;

// Solution: 1 -----------------------------
class Solution {
    public HashMap<Character, Integer> Counter(String target) {
        HashMap<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == ' ') {
                continue;
            }
            if (!counter.containsKey(target.charAt(i))) {
                counter.put(target.charAt(i), 1);
            }
            else {
                int current_freq = counter.get(target.charAt(i));
                current_freq++;
                counter.put(target.charAt(i), current_freq);
            }
        }
        return counter;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<String> anagrams = new HashSet<>();
        List<List<String>> groups = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            List<String> group = new ArrayList<>();

            if (!anagrams.contains(strs[i])) {
                for (int j = i; j < strs.length; j++) {
                    if (Counter(strs[i]).equals(Counter(strs[j]))) {
                        group.add(strs[j]);
                        anagrams.add(strs[j]);
                    }
                }
            }
            if (!group.isEmpty()) {
                groups.add(group);
            }
        }
        return groups;
    }
}


// Solution: 2 ------------------------------
class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);

            String key = new String(charArr);
            if (!anagrams.containsKey(key)) {
                anagrams.put(key, Arrays.asList());
                anagrams.get(key).add(strs[i]);
            }
            else {
                anagrams.get(key).add(strs[i]);
            }
        }

        return new ArrayList<>(anagrams.values());
    }
}