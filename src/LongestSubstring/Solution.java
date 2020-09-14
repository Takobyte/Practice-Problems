package LongestSubstring;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        String temp = "";
        int longest = 0;
        for (int i = 0; i <= (s.length() - 1); i++) {
            String firstLetter = s.substring(i, i + 1);

            // if the first letter is no in the substring then add it
            int duplicateIndex = temp.indexOf(firstLetter);
            if (duplicateIndex == -1) {
                temp = temp.concat(firstLetter);
            } else {
                temp = temp.substring(duplicateIndex + 1);
                temp = temp.concat(firstLetter);
            }

            // If longest substring is less than the new length than replace it
            if (longest < temp.length()) {
                longest = temp.length();
            }
        }
        return longest;
    }
}
