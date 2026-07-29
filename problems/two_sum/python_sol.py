from typing import List

# Solution 1. Brute Force ---------------

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return[i, j]           
        
# Time: O(n^2)
# Space: O(1)
 
# Solution 2: (One pass hashing)  --------------
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevNums = {}
        for i, j in enumerate(nums):
            diff = target - j
            
            if (diff + j) == target:
                if diff in prevNums:
                    return [prevNums[diff], i]
            prevNums[j] = i
        return []

# Time: O(n)
# Space: O(n)

# Solution 3: (Two pass hashing) ------------------
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevNums = {}
        for i, j in enumerate(nums):
            prevNums[j] = i
            
        
        for k in range(len(nums)):
            diff = target - nums[k]
            if (diff + nums[k]) == target:
                if diff in prevNums:
                    return [k, prevNums[diff]]
        return []

# Time: n + n = O(n)
# Space: O(n)