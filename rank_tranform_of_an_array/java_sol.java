package rank_tranform_of_an_array;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> ordered_hashset = new TreeSet<>();
        // adding all arr elements into orderset (TreeSet) specially in java
        for (int i: arr) {
            ordered_hashset.add(i);
        }

        // build a ranks named a hashmap which is responsible to contains a elements with their rank
        HashMap<Integer, Integer> ranks = new HashMap<>();
        int rank = 1;
        for (int j: ordered_hashset) {
            ranks.put(j, rank);
            rank++;
        }

        // result array
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = ranks.get(arr[i]);
        }
        return result;
    } 
}

// Time: O(n log n)
// Space: O(n)  


