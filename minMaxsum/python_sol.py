from typing import List

class Solution:
    def minMaxSum(self, arr: List[int]) -> tuple:
        sums = []
        for i in range(len(arr)):
            sumof = 0
            for j in range(len(arr)):
                if i == j:
                    continue
                sumof += arr[j]
        return (min(sums), max(sums))

# Time: O(n^2)
# Space: O(n)
# For low constraints this particular brute foce solution is good (NOT FOR HIGH CONSTRAINTS)


