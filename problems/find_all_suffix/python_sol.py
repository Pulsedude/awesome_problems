class Solution:
    def findAllSuffix(self, letter: str) -> list[str]:
        suffix = []
        prev_chars = ""
        
        for i in range(len(letter) - 1, -1, -1):
            str_build = ""
            
            if len(prev_chars) > 0:
                str_build += prev_chars
            else:
                str_build += letter[i]
            
            prev_chars += letter[i]
            suffix.append(str_build[::-1])
        
        suffix.append(prev_chars[::-1])
        return suffix

obj = Solution()
print(obj.findAllSuffix("flower"))
