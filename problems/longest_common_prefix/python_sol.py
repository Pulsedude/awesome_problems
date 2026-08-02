from typing import List
from itertools import zip_longest


# Solution: 1 -------------------------------------- Vertical scanning
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        all_prefix = {}

        for letter in range(len(strs)):
            prev_chars = ""
            prefix = []

            for chr in range(len(strs[letter])):
                prefix_builder = ""
                if len(prev_chars) > 0:
                    prefix_builder += prev_chars
                    prefix_builder += strs[letter][chr]
                else:
                    prefix_builder += strs[letter][chr]

                prev_chars += strs[letter][chr]
                prefix.append(prefix_builder)

            all_prefix[strs[letter]] = prefix


        lcp = ""
        for lcps in zip_longest(*all_prefix.values(), fillvalue=None):
            if all(i == lcps[0] for i in lcps):
                if len(lcps[0]) > len(lcp):
                    lcp = lcps[0]
        return lcp

# Time: O(n * m)
# Space: O(n * m)

# Solution: 2 --------------------------------------------- Horizontal scanning
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 1: return strs[0]
        
        first_letter = strs[0]
        current_lcp = ""

        for i in range(1, len(strs)):
            p1 = 0
            p2 = 0
            lcp_builder = ""

            while (p1 < len(current_lcp) and p2 < len(strs[i])) if i > 1 else (p1 < len(first_letter) and p2 < len(strs[i])):
                if ((current_lcp[p1] == strs[i][p2]) if i > 1 else (first_letter[p1] == strs[i][p2])):
                    lcp_builder += strs[i][p2]
                    p1 += 1
                    p2 += 1
                else:
                    break

            current_lcp = lcp_builder
        return current_lcp


# Time: O(n * m)
# Space: O(m)
