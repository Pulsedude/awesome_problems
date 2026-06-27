package create_grid_with_exact_one_path;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    // by using a Static array
    public char[][] createGridStatic(int m, int n) {
        char[][] result = new char[m][n];

        for (int i = 0; i < m; i++) {
            char[] grid = new char[n];

            if (i > 0) {
                for (int __ = 0; __ < n; __++) {
                    if (__ == n - 1) {
                        grid[__] = '*';
                    } else {
                        grid[__] = '#';
                    }
                    result[i] = grid;
                }
            } else {
                for (int __ = 0; __ < n; __++) {
                    grid[__] = '*';
                }
                result[i] = grid;
            }
        }
        return result;
    }

    // by using a Dynamic array
    public ArrayList<ArrayList<Character>> createGrid(int m, int n) {
        ArrayList<ArrayList<Character>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            ArrayList<Character> grid = new ArrayList<>();
            
            if (i > 0) {
                for (int __ = 0; __ < n - 1; __++) {
                    grid.add('#');
                }
                grid.add('*');
            } else {
                for (int __ = 0; __ < n; __++) {
                    grid.add('*');
                }
            }
            result.add(grid);
        }
        return result;
    }
}
