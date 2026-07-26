# Solution: 1 -------------------------------------------

class Solution:
    def splitTime(self, time: str) -> dict:
        return {
            "hr": int(f"{time[0]}{time[1]}"),
            "min": int(f"{time[3]}{time[4]}"),
            "sec": int(f"{time[6]}{time[7]}")

        }

    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
        splited_startTime = self.splitTime(startTime)
        splited_endTime = self.splitTime(endTime)
        return ((splited_endTime.get("hr") * 3600) + (splited_endTime.get("min") * 60) + splited_endTime.get("sec")) - ((splited_startTime.get("hr") * 3600) + (splited_startTime.get("min") * 60) + splited_startTime.get("sec"))
    
# Time: O(1)
# Space: O(1)

# Solution: 2  ----------------------------

class Solution:
    def splitTime(self, time: str) -> list:
        return time.split(":")
    
    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
        splited_startTime = self.splitTime(startTime)
        splited_endTime = self.splitTime(endTime)
        
        return ((int(splited_endTime[0]) * 3600) + (int(splited_endTime[1]) * 60) + int(splited_endTime[2])) - ((int(splited_startTime[0]) * 3600) + (int(splited_startTime[1]) * 60) + int(splited_startTime[2]))
    
# T(n) = n + n + 1 + 1
# T(n) = 2n + 2
# T(n) = n = O(n)

# -----------------------------

# Time: O(n) -> because of splitTime() method
# Space: O(n)        

