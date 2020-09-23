package LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        int sl = s.length();
        String longest = "";
        // if string length is empty or one return itself
        if (sl == 0 || sl == 1) {
            return s;
        }
        // odd
        for(int mid = 0; mid < sl; mid++) {
            for(int i = 1; mid - i >= 0 && mid + i < sl; i++) {
                if(s.charAt(mid-i) != s.charAt(mid+i)) {
                    break;
                }
                int temp_longest = (2 * i) + 1;
                if (temp_longest > longest.length()) {
                    longest = s.substring(mid-i, mid+i+1);
                }
            }

        }
        // Even
        for(int mid = 0; mid < sl; mid++) {
            for(int i = 1; mid - i >= 0 && mid + i <= sl; i++) {
                if(s.charAt(mid-i) != s.charAt(mid + i - 1)) {
                    break;
                }
                int temp_longest = (2 * i);
                if (temp_longest > longest.length()) {
                    longest = s.substring(mid-i, mid+i);
                }
            }

        }
        if (longest.length() == 0) {
            longest = s.substring(0,1);
        }
        return longest;
    }
}
