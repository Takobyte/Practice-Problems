package LongestSubstring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution obj;

    @BeforeEach
    void setUp() {
        obj = new Solution();
    }

    @Test
    void testSubstrings() {
        // s = "dvdf"
        String s = "dvdf";
        int result = obj.lengthOfLongestSubstring(s);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void testRepeatedSubstrings() {
        // s = "abcabcbb"
        String s = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(s);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void testRepeatedCharacters() {
        // s = "bbbbb"
        String s = "bbbbb";
        int result = obj.lengthOfLongestSubstring(s);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void testMultipleSubstrings() {
        // s = "pwwkew"
        String s = "pwwkew";
        int result = obj.lengthOfLongestSubstring(s);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void testComplexSubstrings() {
        // s = "pwwkewpwwke"
        String s = "pwwkewpwabcdwke";
        int result = obj.lengthOfLongestSubstring(s);
        int expected = 7;
        assertEquals(expected, result);
    }

    @Test
    void testEmptyStrings() {
        // s = ""
        String s = "";
        int result = obj.lengthOfLongestSubstring(s);
        int expected = 0;
        assertEquals(expected, result);
    }
}