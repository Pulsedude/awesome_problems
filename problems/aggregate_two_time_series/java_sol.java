package aggregate_two_time_series;

import java.util.*;

class CoolSolution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0, j = 0;
        while ((i < series1.length) && (j < series2.length)) {
            List<Integer> series = new ArrayList<>();

            if (series1[i][0] > series2[j][0]) {
                series.add(series2[j][0]);
                series.add(series2[j][1] + series1[j][1]);
                j++;
            }

            else if (series2[j][0] > series1[i][0]) {
                series.add(series1[i][0]);
                series.add(series1[i][1] + series2[j][1]);
                i++;
            }

            else {
                series.add(series1[i][0]);
                series.add(series1[i][1] + series2[j][1]);
                i++;
                j++;
            }
            result.add(series);
        }

        // checking for remaining elements (data)
        if (i < series1.length) {
            while (i < series1.length) {
                List<Integer> series = new ArrayList<>();
                series.add(series1[i][0]);
                series.add(series1[i][1]);
                result.add(series);
                i++;
            } 
        }
        if (j < series2.length) {
            while (j < series2.length) {
                List<Integer> series = new ArrayList<>();
                series.add(series2[j][0]);
                series.add(series2[j][1]);
                result.add(series);
                j++;
            }
        }
        return result;
    }
}
