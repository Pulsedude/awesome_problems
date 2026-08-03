package top_k_frequent_elements;

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

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counter = Counter(nums);
        List<List<Integer>> bucket = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            bucket.add(Arrays.asList(entry.getValue(), entry.getKey()));
        }

        bucket.sort((a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                int cmp = Integer.compare(b.get(i), a.get(i)); // reverse order
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(b.size(), a.size());
        });

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(bucket.get(i).get(1));
        }
        return result;
    }
}
