package sorting;

import java.util.Arrays;

// for ascending order ------------
class Solution {
    public boolean visualize = false;

    public int[] InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (visualize) {
                System.out.println(Arrays.toString(arr));
            }
            int key = arr[i];
            int j = i - 1;

            while ((j >= 0) && (arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

// for descending order ----------------
class Solution2 {
    public boolean visualize = false;

    public int[] InsertionSortDes(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (visualize) {
                System.out.println(Arrays.toString(arr));
            }
            int key = arr[i];
            int j = i - 1;

            while ((j >= 0) && (arr[j] < key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

// for both ascending & descending -------------
class Solution3 {
    public boolean visualize = false;

    public int[] InsertionSort(int[] arr, boolean reverse) {
        for (int i = 1; i < arr.length; i++) {
            if (visualize) {
                System.out.println(Arrays.toString(arr));
            }
            int key = arr[i];
            int j = i - 1;

            while ((j >= 0) && (reverse ? (arr[j] < key) : (arr[j] > key))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
