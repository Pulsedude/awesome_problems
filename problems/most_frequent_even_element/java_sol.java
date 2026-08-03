package most_frequent_even_element;

import java.util.*;

class Solution {
    public HashMap<Integer, Integer> Counter(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            if (!counter.containsKey(num)) {
                counter.put(num, 0);
            } else {
                int frequency = counter.get(num);
                frequency++;
                counter.put(num, frequency);
            }
        }
        return  counter;
    }

    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> counter = Counter(nums);
        List<List<Integer>> even_elements = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry: counter.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                even_elements.add(Arrays.asList(entry.getKey(), entry.getValue()));
            }
        }

        HashMap<String, Integer> result = new HashMap<>();
        result.put("value", -1);
        result.put("freq", 0);

        for (List<Integer> element: even_elements) {
            if (Objects.equals(element.get(1), result.get("freq"))) {
                if (element.getFirst() < result.get("value")) {
                    result.put("value", element.getFirst());
                    result.put("freq", element.get(1));
                }
            }
            else {
                if (element.get(1) > result.get("freq")) {
                    result.put("value", element.getFirst());
                    result.put("freq", element.get(1));
                }
            }
        }
        return result.get("value");
    }
}