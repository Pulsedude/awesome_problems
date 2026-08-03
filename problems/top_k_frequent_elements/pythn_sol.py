from collections import Counter
from typing import List


# Solution: 1 ------------- sorting
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = Counter(nums)
        bucket = []

        for key, val in counter.items():
            bucket.append((val, key))
        
        sorted_bucket = sorted(bucket, reverse=True)
        result = []

        for i in range(0, k):
            result.append(sorted_bucket[i][1])
        return result

# Time: O(k + n log n)
# Space: O(k)