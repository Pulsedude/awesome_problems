class Solution:
    def lettersLength(self, text_arr: str) -> list:
        lengths = []
        for index, letter in enumerate(text_arr):
            lengths.append((len(letter), index, letter))
        return lengths

    def arrangeWords(self, text: str) -> str:
        text_arr = text.split()
        letters_with_length = self.lettersLength(text_arr)
        letters_with_length.sort()
        
        result = ""
        for index, letter_tup in enumerate(letters_with_length):
            if index > 0:
                result += f" {letter_tup[2].lower()}"
            else:
                result += f"{letter_tup[2].capitalize()}" 
        return result

# Time: O(n log n)
# Space: O(n)
        


