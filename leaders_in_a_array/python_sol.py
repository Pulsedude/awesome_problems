from typing import List


class Solution:
    def leaders_in_array(self, arr: List[int]):
        if len(arr) < 0:
            return []

        output = [arr[-1]]  # n space
        current_max = arr[-1]
        for i in range(len(arr) - 2, -1, -1):  # n time taken
            if arr[i] >= current_max:
                output.append(arr[i])
                current_max = arr[i]
        return output[::-1]  # n time taken to reverse the array

# Time Complexity: n + n = O(n)
# Space Complexity: O(n)


obj = Solution()
print(obj.leaders_in_array([10, 4, 2, 4, 1]))
print(obj.leaders_in_array([5, 10, 20, 40]))