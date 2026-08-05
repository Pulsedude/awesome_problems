package sorting;

import java.util.*;

// for ascending order ------------------
class Solution {
    public boolean visualize = false;

    public int[] SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (visualize) {
                System.out.println(Arrays.toString(arr));
            }
            int min_element = Integer.MAX_VALUE;
            int element_idx = -1;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min_element) {
                    min_element = arr[j];
                    element_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = min_element;
            arr[element_idx] = temp;
        }
        return arr;
    }
}


// for descending order ---------------------
class Solution2 {
    public boolean visualize = false;

    public int[] SelectionSortDes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (visualize) {
                System.out.println(Arrays.toString(arr));
            }
            int max_element = -1;
            int element_idx = -1;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max_element) {
                    max_element = arr[j];
                    element_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = max_element;
            arr[element_idx] = temp;
        }
        return arr;
    }
}

// for both ascending & descending order ---------------
class Solution3 {
    public boolean visualize = false;

    public int[] SelectionSort(int[] arr, boolean reverse) {
        for (int i = 0; i < arr.length; i++) {
            if (visualize) {
                System.out.println(Arrays.toString(arr));
            }
            int min_or_max_element = reverse ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            int element_idx = -1;

            for (int j = i; j < arr.length; j++) {
                if (reverse ? (arr[j] > min_or_max_element) : (arr[j] < min_or_max_element)) {
                    min_or_max_element = arr[j];
                    element_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = min_or_max_element;
            arr[element_idx] = temp;
        }
        return arr;
    }
}

