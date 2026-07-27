class Solution:
    def aggregateTimeSeries(self, series1: list[list[int]], series2: list[list[int]]) -> list[list[int]]:
        result = []
        i, j = 0, 0

        while i < len(series1) and j < len(series2):
            series = []
            if series1[i][0] > series2[j][0]:
                series.append(series2[j][0])
                series.append(series2[j][1] + series1[i][1])
                j += 1
            
            elif series2[j][0] > series1[i][0]:
                series.append(series1[i][0])
                series.append(series1[i][1] + series2[j][1])
                i += 1
            
            else:
                series.append(series1[i][0])
                series.append(series1[i][1] + series2[j][1])
                i += 1
                j += 1
            result.append(series)
        
        # checking for remaining elements (data) then using extra loops for the remaining elements (data)
        if i < len(series1):
            while i < len(series1):
                series = []
                series.append(series1[i][0])
                series.append(series1[i][1] + 0)
                result.append(series)
                i += 1
        
        if j < len(series2):
            while j < len(series2):
                series = []
                series.append(series2[j][0])
                series.append(series2[j][1] + 0)
                result.append(series)
                j += 1
            
        return result
            


# Time: O(n + m)
# Space: O(n + m) because of [timespamp, value] (nested list)

