class Solution:
    def addMissingElements(self, items1: list[list[int]], items2: list[list[int]], pairs_added: dict, result_array: list[list[int]]) -> None:
        concated_array = items1 + items2
        for pair in concated_array:
            if pairs_added.get(pair[0]) is None:
                result_array.append(pair)
        
    def mergeSimilarItems(self, items1: list[list[int]], items2: list[list[int]]) -> list[list[int]]:
        items1_map = {}
        items2_map = {}
        
        for items1_pair in items1:
            items1_map[items1_pair[0]] = items1_pair[1]
        
        for items2_pair in items2:
            items2_map[items2_pair[0]] = items2_pair[1]
        
        pairs_added_with_val = {} # we can also use hashset instead of hashmap (set recommended)
        result = []
        
        for pair in items1:
            if (items2_map.get(pair[0])) is not None:
                result.append([
                    pair[0],
                    pair[1] + items2_map.get(pair[0])
                ])
                pairs_added_with_val[pair[0]] = [pair[0], pair[1] + items2_map.get(pair[0])]
            else:
                result.append(pair)
                pairs_added_with_val[pair[0]] = pair

        self.addMissingElements(items1, items2, pairs_added_with_val, result)
        return sorted(result)

obj = Solution()
print(obj.mergeSimilarItems([[1,1],[4,5],[3,8]], [[3,1],[1,5]]))
        
# Time: O((n + m) + n log n)
# Space: O(n + m)