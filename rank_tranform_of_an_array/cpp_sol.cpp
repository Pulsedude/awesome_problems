#include <iostream>
#include <set>
#include <map>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        set<int> ordered_hashset;
        for (int i: arr) {
            ordered_hashset.insert(i);
        }

        map<int, int> ranks;
        int rank = 1;
        for (int j: ordered_hashset) {
            ranks[j] = rank;
            rank++;
        }

        vector<int> result;
        for (int i = 0; i < arr.size(); i++) {
            result.push_back(ranks[arr[i]]);
        }
        return result;
    }
};

// Time: O(n log n)
// Space: O(n)