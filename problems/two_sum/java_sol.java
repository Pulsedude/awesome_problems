package two_sum;

import java.util.*;


// Solution: 1 (Brute force) -------------

class CoolSolution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

// Time: O(n^2) Quadratic time because of nested loops
// Space: O(1) Constant space


// Solution: 2 (One Pass Hashing) --------------

class CoolSolution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if ((nums[i] + diff) == target) {
                if (prevNums.containsKey(diff)) {
                    return new int[]{prevNums.get(diff), i};
                }
            }
            prevNums.put(nums[i], i);
        }
        return new int[0];
    } 
}
// Time: O(n)
// Space: O(n)

// Solution: 3 (two pass hashing) ---------------------
class CoolSolution3 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            prevNums.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];

            if ((diff + nums[j]) == target) {
                if (prevNums.containsKey(diff)) {
                    return new int[]{nums[j], prevNums.get(diff)};
                }
            }
        }
        return new int[0];
    }
}
// Time: O(n)
// Space: O(n)