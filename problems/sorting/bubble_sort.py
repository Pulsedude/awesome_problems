from typing import List

# for ascending order ----------
class Solution:
    def BubbleSort(self, nums: List[int], visualize: bool = False) -> List[int]:
        for i in range(len(nums)):
            for j in range(len(nums) - 1 - i):
                if visualize:
                    print(nums)
                    
                if nums[j] > nums[j + 1]:
                    nums[j], nums[j + 1] = nums[j + 1], nums[j]
        return nums

# for descending order ------------
class Solution:
    def BubbleSortReverse(self, nums: List[int], visualize: bool = False) -> List[int]:
        for i in range(len(nums)):
            for j in range(len(nums) - 1 - i):
                if visualize:
                    print(nums)
                
                if nums[j] < nums[j + 1]:
                    nums[j], nums[j + 1] = nums[j + 1], nums[j]
        return nums

# for both ascending & descending order --------------
class Solution:
    def BubbleSort(self, nums: List[int], reverse: bool = False, visualize: bool = False) -> List[int]:
        for i in range(len(nums)):
            for j in range(len(nums) - 1 - i):
                if visualize:
                    print(nums)
                
                if nums[j] < nums[j + 1] if reverse else nums[j] > nums[j + 1]:
                    nums[j], nums[j + 1] = nums[j + 1], nums[j]
        return nums


# Time: O(n^2)
# Space: O(n)

# obj = Solution()
# print(obj.BubbleSort([3,2,1,0,8,9,2])) 
                    
                
                