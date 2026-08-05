package sorting;

import java.util.*;

// for ascending order ------------------------------------
class Solution {
    public boolean visualize = false;

    public int[] BuubleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (visualize) {
                System.out.println(Arrays.toString(arr));
            }

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

// for descending order -----------------------------
class Solution2 {
    public boolean visualize = false;

    public int[] BuubleSortdes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (visualize) {
                System.out.println(Arrays.toString(arr));
            }

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

// for both ascending & descending order -----------------
class Solution3 {
    public boolean visualize = false;

    public int[] BubbleSort(int[] arr, boolean reverse) {
        for (int i = 0; i < arr.length; i++) {
            if (visualize) {
                System.out.println(Arrays.toString(arr));
            }

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (reverse ? (arr[j] < arr[j + 1]) : (arr[j] > arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

// public class bubble_sort {
//     public static void main(String[] args) {
//         Solution coolsol = new Solution();
//         coolsol.visualize = true;
//         System.out.println(Arrays.toString(coolsol.BuubleSort(new int[]{4, 5, 1, 2, 6, 9, 4, 1})));
//     }
// }