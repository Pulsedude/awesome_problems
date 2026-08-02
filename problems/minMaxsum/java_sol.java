package minMaxsum;

import java.util.HashMap;

class Solution {
    int max(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    int min(int[] array) {
        int result = max(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    // Solution by using static array
    public HashMap<String, Integer> minMaxsum(int[] arr) {
        int n = arr.length;
        int[] sums = new int[n];
        HashMap<String, Integer> result = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                currentSum += arr[j];
            }
            sums[i] = currentSum;
        }
        // putting values in result HashMap 
        result.put("Min", min(sums));
        result.put("Max", min(sums));
        return result;
    }
}

