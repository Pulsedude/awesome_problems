package valid_word_abbreviation;

class Solution {
    public String getSteps(String abbr) {
        String steps = "";
        for (char i: abbr.toCharArray()) {
            if (!Character.isDigit(i)) {
                return steps;
            }
            steps += i;
        }
        return steps;
    }

    public boolean validWordAbbreviation(String word, String abbr) {
        int i, j, n, m;
        i = 0;
        j = 0;
        n = word.length();
        m = abbr.length();

        while ((i < n) && (j < m)) {
            if (abbr.charAt(j) == '0') {
                return false;
            }
            else if (Character.isDigit(abbr.charAt(j))) {
                String moves = getSteps(abbr.substring(j));
                i += Integer.parseInt(moves);
                i += moves.length();
                continue;
            }
            else if (word.charAt(i) != abbr.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }
        return i == n && j == m;
    }
}

public class java_sol {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.validWordAbbreviation("apple", "a3e"));
        System.out.println(sol.validWordAbbreviation("international", "i9l"));
    }
}
