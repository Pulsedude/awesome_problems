class Solution:
    def findAllPrefix(self, letter: str):
        prefix = []
        prev_chars = ""
        
        for i in letter:
            str_builder = ""
            
            if len(prev_chars) > 0:
                str_builder += prev_chars
            else:
                str_builder += i
            prev_chars += i
            prefix.append(str_builder)
        
        prefix.append(prev_chars)
        return prefix

obj = Solution()
print(obj.findAllPrefix("flower"))    