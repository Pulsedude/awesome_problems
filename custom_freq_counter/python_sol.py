from typing import Iterable

class Solution:
    def Counter(self, itearble: Iterable) -> dict:
        counter = {}
        for i in itearble:
            counter[i] = tuple(itearble).count(i)
        return counter  

obj = Solution()
print(obj.Counter("yooyoo"))