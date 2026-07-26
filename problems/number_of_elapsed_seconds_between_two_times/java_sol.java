package problems.number_of_elapsed_seconds_between_two_times;

import java.util.*;

class Solution {
    public HashMap<String, Integer> splitTime(String time) {
        HashMap<String, Integer> splited_time = new HashMap<>();

        splited_time.put("hr", Integer.parseInt(String.format("%s%s", time.charAt(0), time.charAt(1))));
        splited_time.put("min", Integer.parseInt(String.format("%s%s", time.charAt(3), time.charAt(4))));
        splited_time.put("sec", Integer.parseInt(String.format("%s%s", time.charAt(6), time.charAt(7))));

        return splited_time;
    }

    public int secondsBetweenTimes(String startTime, String endTime) {
        HashMap<String, Integer> splited_startTime = splitTime(startTime);
        HashMap<String, Integer> splited_endTime = splitTime(endTime);

        return ((splited_endTime.get("hr") * 3600) + (splited_endTime.get("min") * 60) + splited_endTime.get("sec")) - ((splited_startTime.get("hr") * 3600) + (splited_startTime.get("min") * 60) + splited_startTime.get("sec"));
    }
}

