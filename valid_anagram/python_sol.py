from collections import Counter

# solution 1: by using sorting approach -----------------------------
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return sorted(s) == sorted(t)

# time: O(n logn n + m log m)
# space: O(n + m)


# solution 2: by using Counting & hashtable approach -----------------------
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        counter1 = Counter(s)
        counter2 = Counter(t)
        return counter1 == counter2

# time: O(n + m)
# space: O(k)