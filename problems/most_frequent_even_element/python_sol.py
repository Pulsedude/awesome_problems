from collections import Counter
from typing import List

class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        counter = Counter(nums)
        even_elements = []

        for key, val in counter.items():
            if key % 2 == 0:
                even_elements.append((key, val))

        result = {"value": -1, "freq": 0}
        for element in even_elements:
            if element[1] == result.get("freq"):
                if element[0] < result.get("value"):
                    result["value"], result["freq"] = element[0], element[1] 
            else:
                if element[1] > result.get("freq"):
                    result["value"], result["freq"] = element[0], element[1]
        return result.get("value")
            
            

# Time: O(n)
# Space: O(k)