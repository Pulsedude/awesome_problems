from typing import List

class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        ranks = {}
        rank = 1
        for i in sorted(set(arr)):
            ranks[i] = rank
            rank += 1
        
        result = []
        for j in arr:
            result.append(ranks.get(j))
        return result

# Time: O(n log n)
# Space: O(n)