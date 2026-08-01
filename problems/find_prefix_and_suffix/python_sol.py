class Solution:
    def findAllPrefixAndSuffix(self, word: str) -> dict:
        prefix = []
        suffix = []
        prev_chars_for_prefix = ""
        prev_chars_for_suffix = ""

        for i in range(len(word)):
            prefix_builder = ""
            
            if len(prev_chars_for_prefix) > 0:
                prefix_builder += prev_chars_for_prefix
                prefix_builder += word[i]
            
            else:
                prefix_builder += word[i]
            prev_chars_for_prefix += word[i]
            prefix.append(prefix_builder)
        
        for j in range(len(word) - 1, -1, -1):
            suffix_builder = ""
            
            if len(prev_chars_for_suffix) > 0:
                suffix_builder += prev_chars_for_suffix
                suffix_builder += word[j]
            
            else:
                suffix_builder += word[j]
            prev_chars_for_suffix += word[j]
            suffix.append(suffix_builder[::-1])
        
        return {"prefix": prefix, "suffix": suffix}


obj = Solution()
print(obj.findAllPrefixAndSuffix("flower"))
