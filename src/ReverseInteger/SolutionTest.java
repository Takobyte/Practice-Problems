package ReverseInteger;

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
    void testReverseNum1() {
        int result = obj.reverse(123);
        int expected = 321;
        assertEquals(expected,result);
    }

    @Test
    void testReverseNegativeNum1() {
        int result = obj.reverse(-123);
        int expected = -321;
        assertEquals(expected, result);
    }

    @Test
    void testReverseLeadingZero() {
        int result = obj.reverse(120);
        int expected = 21;
        assertEquals(expected, result);
    }

    @Test
    void testReverseZero() {
        int result = obj.reverse(0);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void testReverseOverflowException() {
        int result = obj.reverse(1534236469);
        int expected = 0;
        assertEquals(expected, result);
    }
}