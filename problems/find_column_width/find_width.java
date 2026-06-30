package problems.find_column_width;

import java.util.ArrayList;

class Solution6 {
    public ArrayList<Integer> findWidth(ArrayList<ArrayList<Integer>> grid) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int j = 0; j < grid.getFirst().size(); j++) {
            int max_length_digit = 0;

            for (int i = 0; i < grid.size(); i++) {
                max_length_digit = Math.max(max_length_digit, String.valueOf(grid.get(i).get(j)).length());
            }
            result.add(max_length_digit);
        }
        return result;
    }
}

public class find_width {
    public static void main(String[] args) {
        Solution6 sol6 = new Solution6();

        // Testcase 1:
        ArrayList<ArrayList<Integer>> t1 = new ArrayList<>();
        // row1
        ArrayList<Integer> r1 = new ArrayList<>();
        r1.add(1);
        // row2
        ArrayList<Integer> r2 = new ArrayList<>();
        r2.add(22);
        // row3
        ArrayList<Integer> r3 = new ArrayList<>();
        r3.add(333);

        t1.add(r1);
        t1.add(r2);
        t1.add(r3);

        // Testcase 2:
        ArrayList<ArrayList<Integer>> t2 = new ArrayList<>();
        // row1
        ArrayList<Integer> t2_r1 = new ArrayList<>();
        t2_r1.add(-15);
        t2_r1.add(1);
        t2_r1.add(3);

        // row2
        ArrayList<Integer> t2_r2 = new ArrayList<>();
        t2_r2.add(15);
        t2_r2.add(7);
        t2_r2.add(12);

        //row3
        ArrayList<Integer> t2_r3 = new ArrayList<>();
        t2_r3.add(5);
        t2_r3.add(6);
        t2_r3.add(-2);

        t2.add(t2_r1);
        t2.add(t2_r2);
        t2.add(t2_r3);

        System.out.println(sol6.findWidth(t1));
        System.out.println(sol6.findWidth(t2));
    }
}
