from typing import List 

# Solution: 1 -> Sorting and Linear Check ---------------

class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        for i in range(len(nums) - 1):
            if nums[i] == nums[i + 1]:
                return True
        return False

# # Time: O(n log n + n)
# # Space: O(1)

# # Solution: 2 -> Hashsets comparison --------------------

class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        return len(sorted(nums)) == len(nums)

# Time: O(n log n)
# Space: O(1)

# Solution: 3 -> Brute Force --------------------------
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    return True
        return False

# Time: O(n^2)
# Space: O(1)


# Solution: 4 -> Hashset linear check
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for i in range(len(nums)):
            if nums[i] in seen: # Takes O(1) time because of using hashsets which uses hash() function to check whether element present in seen set() or not instead of using iteration from begin to end to check element
                return True
            seen.add(nums[i])
        return False

# Time: O(n)
# Space: O(n)


