from typing import List
from collections import Counter

# Solution: 1 ------------ brute force + linear scanning with Counting approach


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = []
        anagrams = set()

        for i in range(len(strs)):
            group = []

            if strs[i] not in anagrams:
                for j in range(i, len(strs)):

                    if Counter(strs[i]) == Counter(strs[j]):
                        group.append(strs[j])
                        anagrams.add(strs[j])

            if len(group) > 0:
                groups.append(group)
        return groups

# Time: O(n^2 * k)
# Space: O(n + m * k)

# Solution: 2 --------------------- Sorting +  hashmap
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}
        
        for i in strs:
            key = "".join(sorted(i))
            
            if anagrams.get(key) is None:
                anagrams[key] = []
                anagrams[key].append(i)
            else:
                anagrams[key].append(i)
        return list(anagrams.values())

# Time: O(m * k log k)
# Time: O(n)

# Solution: 3 ----------------------- linear scanning + hashmap
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        alphabets = [0] * 26
        anagrams = {}
        
        for i in range(len(strs)):
            for j in range(len(strs[i][j])):
                anagrams[ord]