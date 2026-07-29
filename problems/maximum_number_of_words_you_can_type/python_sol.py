# Solution: 1 ----------------------------------

class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        cannot_type = 0
        text_arr = text.split()
        
        for letters in text_arr:
            for i in letters:
                if i in brokenLetters:
                    cannot_type += 1
                    break
        
        return len(text_arr) - cannot_type

# Time: O(n * m)
# Space: O(n) 

# Solution: 2 ------------------------------------------

class Solution:
    def canBeTypeWords(self, text: str, brokenLetters: str) -> int:
        cannot_type = 0
        text_arr = text.split()
        
        for letters in text_arr: 
            for i in letters:
                if i in set(brokenLetters): # converting brokenLetters string to hashset for O(1) lookups
                    cannot_type += 1
                    break
                
        return len(text_arr) - cannot_type

# Time: O(n * m)
# Space: O(n)

