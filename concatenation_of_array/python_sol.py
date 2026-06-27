from typing import List

# Solution 1: just by using arithmetic (+) operator
class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        return nums + nums

# Time: O(n)
# Space: O(n)

# Solution 2: Simulation
class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = nums + [0] * len(nums) # -> if nums = [1,4,1,2] then ans arary becomes here ans = [1,4,1,2,0,0,0,0]
        i, j = len(nums), 0                                                                              
        while i < len(ans):
            ans[i] = nums[j]
            i += 1
            j += 1
        return ans

# Time: O(n)
# Space: O(n)
    
# obj = Solution()
# print(obj.getConcatenation([1,4,1,2]))


