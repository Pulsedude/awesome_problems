class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        result = []
        i = 0
        for _ in range(m):
            steps = ""
            if i >= 1:
                for _ in range(n - 1):
                    steps += "#"
                steps += "."
                result.append(steps)
            else:
                for _ in range(n):
                    steps += "."
                result.append(steps)
            i += 1
        return result
            
# Time: O(m * n)
# Space: O(n)


    