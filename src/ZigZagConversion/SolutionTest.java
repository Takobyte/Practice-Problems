package ZigZagConversion;

import ZigZagConversion.Solution;
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
        String result = obj.convert("abcdef", 3);
        String expected = "abc";
        assertEquals(expected, result);
    }
}