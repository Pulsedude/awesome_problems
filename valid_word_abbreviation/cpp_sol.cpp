#include <iostream>
#include <string>
#include <cctype>
#include <stdlib.h>

using namespace std;

class Solution {
public:
    string getSteps(string abbr) {
        string total_steps = "";
        for (char i: abbr) {
            if (!isdigit(i)) {
                return total_steps;
            }
            total_steps += i;
        }
        return total_steps;
    }

    bool validWordAbbreviation(string word, string abbr) {
        int i, j, n, m;
        i = 0;
        j = 0;
        n = word.size();
        m = abbr.size();

        while ((i < n) && (j < m)) {
            if (abbr[j] == '0') {
                return false;
            }
            else if (isdigit(abbr[j])) {
                string moves = getSteps(abbr.substr(j, m - 1));
                i += stoi(moves);
                j += moves.size();
            }
            else if (word[i] != abbr[j]) {
                return false;
            }
            i++;
            j++;
        }
        return i == n && j == m;
    }
};

int main(int argc, char const *argv[]) {
    Solution sol;
    cout << sol.validWordAbbreviation("apple", "a3e") << endl;;
    cout << sol.validWordAbbreviation("international", "i9l") << endl;;
    cout << sol.validWordAbbreviation("abbreviation", "abbreviation") << endl;

    return EXIT_SUCCESS;
}