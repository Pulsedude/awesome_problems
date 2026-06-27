class Solution:
    def addDigits(self, number_of_digits: int, number: int, splited_blocks: bool = False) -> tuple:
        group = []
        if splited_blocks:
            block1 = [number[0], number[1]]
            block2 = [number[2], number[3]]
            group.append("".join(block1))
            group.append("".join(block2))
            return (group, 4)

        i = 0
        while i < number_of_digits:
            group.append(number[i])
            i += 1
        return (group, i)

    def reformatNumber(self, number: str) -> str:
        number = "".join([i for i in number if i.isdigit()])
        groups = []
        group = ""
        total_digits = len(number)
        remaining = 0
        added = 0
        i = 0
        while True:
            remaining = total_digits - added
            if remaining > 4 or remaining == 3:
                group = self.addDigits(3, number[i:])
                groups.append("".join(group[0]))
                added += 3
                i += group[1]
                group = ""

            elif remaining == 2:
                group = self.addDigits(2, number[i:])
                groups.append("".join(group[0]))
                added += 2
                i += group[1]
                group = ""

            elif remaining == 4:
                group = self.addDigits(4, number[i:], True)
                groups.append("".join(group[0]))
                added += 4
                i += group[1]
                group = ""
            else:
                return "-".join(groups)

# Time complexity: O(n)
# Space complexity: O(n)

obj = Solution()
print(obj.reformatNumber("123 4-567"))
print(obj.reformatNumber("1- 2 -3 -4- 5 - 6"))
print(obj.reformatNumber("1 1")) 