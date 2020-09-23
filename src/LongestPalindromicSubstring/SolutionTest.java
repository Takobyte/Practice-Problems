package LongestPalindromicSubstring;

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
    void testString1() {
        String inputString = "babad";
        String result = obj.longestPalindrome(inputString);
        String expected = "bab";
        assertEquals(expected, result);
    }

    @Test
    void testString2() {
        String inputString = "cbbd";
        String result = obj.longestPalindrome(inputString);
        String expected = "bb";
        assertEquals(expected, result);
    }

    @Test
    void testEmptyString() {
        String inputString = "";
        String result = obj.longestPalindrome(inputString);
        String expected = "";
        assertEquals(expected, result);
    }

    @Test
    void testSingleCharString() {
        String inputString = "a";
        String result = obj.longestPalindrome(inputString);
        String expected = "a";
        assertEquals(expected, result);
    }

    @Test
    void testPalindromicString() {
        String inputString = "aaabaaa";
        String result = obj.longestPalindrome(inputString);
        String expected = "aaabaaa";
        assertEquals(expected, result);
    }

    @Test
    void testTwoCharString() {
        String inputString = "ac";
        String result = obj.longestPalindrome(inputString);
        String expected = "a";
        assertEquals(expected, result);
    }

    @Test
    void testTwoCharString2() {
        String inputString = "aa";
        String result = obj.longestPalindrome(inputString);
        String expected = "aa";
        assertEquals(expected, result);
    }

    @Test
    void testNoPalindrome() {
        String inputString = "abcda";
        String result = obj.longestPalindrome(inputString);
        String expected = "a";
        assertEquals(expected, result);
    }

    @Test
    void testString3() {
        String inputString = "abacab";
        String result = obj.longestPalindrome(inputString);
        String expected = "bacab";
        assertEquals(expected, result);
    }
}