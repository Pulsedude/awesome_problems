class Solution:
    def getSteps(self, abbr: str) -> str:
        total_steps = ''
        for i in abbr:
            if not i.isdigit():
                return total_steps
            total_steps += i
        return total_steps   
    
    def validWordAbbreviation(self, word: str, abbr: str) -> bool:
        i, j = 0, 0
        n, m = len(word), len(abbr)
        
        while i < n and j < m:
            if abbr[j] == '0':
                return False
            
            elif abbr[j].isdigit():
                moves = self.getSteps(abbr[j:])
                i += int(moves)
                j += len(moves)
                continue
            
            elif word[i] != abbr[j]:
                return False
            i += 1
            j += 1
        
        return i == n and j == m

# Time: O(n + m)
# Space: O(1)