#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution {
public: 
    vector<string> createGrid(int m, int n) {
        vector<string> result;

        for (int i = 0; i < m; i++) {
            string steps;
            if (i >= 1) {
                for (int _ = 0; _ < n - 1; _++) {
                    steps += "#";
                }
                steps += ".";
                result.push_back(steps);
            }
            else {
                for (int _ = 0; _ < n; _++) {
                    steps += ".";
                }
                result.push_back(steps);
            }
        }
        return result;
    }
};

int main(int argc, char const *argv[]) {
    Solution sol;
    vector<string> output = sol.createGrid(3, 3);
    for (string i: output) {
        cout << i << endl;
    }
    return 0;
}

// Time: O(m * n)
// Space: O(n)