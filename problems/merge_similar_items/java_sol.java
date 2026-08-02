package merge_similar_items;

import java.util.*;

class Solution {
    public void addMissingPairs(int[][] items1, int[][] items2, HashMap<Integer, List<Integer>> pairs_added, TreeSet<List<Integer>> result_set) {
        int[][] concated_arr = new int[items1.length + items2.length][];

        int i = 0;

        for (int[] items1_pair: items1) {
            concated_arr[i++] = items1_pair;
        }
        for (int[] items2_pair: items2) {
            concated_arr[i++] = items2_pair;
        }

        for (int[] pair: concated_arr) {
            if (!pairs_added.containsKey(pair[0])) {
                result_set.add(Arrays.asList(pair[0], pair[1]));
            }
        }
    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> item1_map = new HashMap<>();
        HashMap<Integer, Integer> item2_map = new HashMap<>();
        
        // adding items elements into in form of key, value pair into their hashmaps
        for (int[] item1_pair: items1) {
            item1_map.put(item1_pair[0], item1_pair[1]);
        }
        for (int[] item2_pair: items2) {
            item2_map.put(item2_pair[0], item2_pair[1]);
        }

        TreeSet<List<Integer>> result_set = new TreeSet<>(
                Comparator.comparing((List<Integer> l) -> l.get(0))
                        .thenComparing(l -> l.get(1))
        );
        
        HashMap<Integer, List<Integer>> pairs_added_with_val = new HashMap<>();

        for (int[] pair: items1) {
            if (item2_map.containsKey(pair[0])) {
                result_set.add(Arrays.asList(pair[0], (pair[1] + item2_map.get(pair[0]))));
                pairs_added_with_val.put(pair[0], Arrays.asList(pair[0], (pair[1] + item2_map.get(pair[0]))));
            } 
            else {
                result_set.add(Arrays.asList(pair[0], pair[1]));
                pairs_added_with_val.put(pair[0], Arrays.asList(pair[0], pair[1]));
            }
        }
        
        // modify result set by adding remanining elements
        addMissingPairs(items1, items2, pairs_added_with_val, result_set);
        List<List<Integer>> result = new ArrayList<>(result_set);
        return result;
    }
}
