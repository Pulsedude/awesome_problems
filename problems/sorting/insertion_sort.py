from typing import List

# for ascending order ---------------


class Solution:
    def InsertionSort(self, nums: List[int], visualize: bool = False) -> List[int]:
        for i in range(1, len(nums)):
            if visualize:
                print(nums)
            
            key = nums[i]
            j = i - 1
            
            while j >= 0 and nums[j] > key:
                nums[j + 1] = nums[j]
                j -= 1
                
            nums[j + 1] = key
        return nums



# for descending order -----------------

class Solution:
    def InsertionSortDes(self, nums: List[int], visualize: bool = False) -> List[int]:
        for i in range(1, len(nums)):
            if visualize:
                print(nums)
            
            key = nums[i]
            j = i - 1
            
            while j >= 0 and nums[j] < key:
                nums[j + 1] = nums[j]
                j -= 1
            
            nums[j + 1] = key
        return nums
    

# for both ascending & descending order --------------
class Solution:
    def InsertionSort(self, nums: List[int], reverse: bool = False, visualize: bool = False) -> List[int]:
        for i in range(1, len(nums)):
            if visualize:
                print(nums)
            
            key = nums[i]
            j = i - 1
            
            while j >= 0 and ((nums[j] < key) if reverse else (nums[j] > key)):
                nums[j + 1] = nums[j]
                j -= 1
            
            nums[j + 1] = key
        return nums

# obj = Solution()
# print(obj.InsertionSort([3, 2, 1, 2, 8, 9]))
