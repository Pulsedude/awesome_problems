from collections import Counter
from typing import List


class Solution:
    def oddString(self, words: List[str]) -> str:
        # check whether words has multiple same string except only one 
        words_counter = Counter(words)
        if len(list(words_counter)) == 2:
            return next(word for word, freq in words_counter.items() if freq == 1)
        
        # if words list has more then 3 different strings 
        alphabet_dict = {chr(ord('a') + i): i for i in range(26)}
        differences = {}
        for i in range(len(words)):
            difference = []
            cal_diff = 0
            for j in range(len(words[i]) - 1, 0, -1):
                cal_diff = alphabet_dict[words[i][j]] - alphabet_dict[words[i][j - 1]]
                difference.append(cal_diff)
            differences[words[i]] = difference[::-1]
        
        pairs_with_diff = list(differences.items())
        freq = Counter(tuple(diff) for _, diff in pairs_with_diff)
        return next(word for word, diff in pairs_with_diff if freq[tuple(diff)] == 1)
        
obj = Solution()
print(obj.oddString(["dtzca","dtzca","dtzca","yqyyo","dtzca","dtzca"]))