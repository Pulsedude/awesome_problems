from typing import List

class Solution:
    def findColumnWidth(self, grid: List[List[int]]) -> List[int]:
        result = []
        for j in range(len(grid[0])):
            max_length_num = 0

            for i in range(len(grid)):
                max_length_num = max(max_length_num, len(str(grid[i][j])))
            result.append(max_length_num) 
        return result

# Time: O(m * n)  where m is column and n is rows of given grid matrix
# Space: O(n)

