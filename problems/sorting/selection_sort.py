from typing import List
import sys

# for ascending order ------------------------------
class Solution:
    def selectionSort(self, nums: List[int], visualize: bool = False) -> List[int]:
        for i in range(len(nums)):
            if visualize:
                print(nums)
                
            min_element = sys.maxsize
            index_of_min_element = -1
            
            for j in range(i, len(nums)):
                if nums[j] < min_element:
                    min_element, index_of_min_element =  nums[j], j
            
            nums[i], nums[index_of_min_element] = min_element, nums[i]
        
        return nums


# for descending order -------------------------------
class Solution:
    def selectionSortReverse(self, nums: List[int], visualize: bool = False) -> List[int]:
        for i in range(len(nums)):
            if visualize:
                print(nums)
                
            max_element = -1
            index_of_max_element = -1
            
            for j in range(i, len(nums)):
                if nums[j] > max_element:
                    max_element, index_of_max_element = nums[j], j
            
            nums[i], nums[index_of_max_element] = max_element, nums[i]
        
        return nums

# for both ascending & descending order ------------------------
class Solution:
    def SelectionSort(self, nums: List[int], reverse: bool = False, visualize: bool = False) -> List[int]:
        for i in range(len(nums)):
            if visualize:
                print(nums)
                
            min_or_max_element = -1 if reverse else sys.maxsize
            index_of_min_or_max_element = -1
            
            for j in range(i, len(nums)):
                if nums[j] > min_or_max_element if reverse else nums[j] < min_or_max_element:
                    min_or_max_element, index_of_min_or_max_element = nums[j], j
            
            nums[i], nums[index_of_min_or_max_element] = min_or_max_element, nums[i]
        
        return nums 

# Time: O(n^2)
# Space: O(n)

# obj = Solution()
# print(obj.SelectionSort([3,2,1,2,8,9,0]))