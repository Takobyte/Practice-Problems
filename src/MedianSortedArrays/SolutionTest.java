package MedianSortedArrays;

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
    void testNumsOneNumsEach() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        double result = obj.findMedianSortedArrays(nums1,nums2);
        double expected = 1.50000;
        assertEquals(expected, result);
    }

    @Test
    void testNumsUnevenArrays() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double result = obj.findMedianSortedArrays(nums1,nums2);
        double expected = 2.00000;
        assertEquals(expected, result);
    }

    @Test
    void testNumsEvenArrays() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double result = obj.findMedianSortedArrays(nums1,nums2);
        double expected = 2.50000;
        assertEquals(expected, result);
    }

    @Test
    void testZeroNumsEvenArrays() {
        int[] nums1 = {0,0};
        int[] nums2 = {0,0};
        double result = obj.findMedianSortedArrays(nums1,nums2);
        double expected = 0.00000;
        assertEquals(expected, result);
    }

    @Test
    void testZeroNumsUnevenArrays() {
        int[] nums1 = {0};
        int[] nums2 = {0,0};
        double result = obj.findMedianSortedArrays(nums1,nums2);
        double expected = 0.00000;
        assertEquals(expected, result);
    }

    @Test
    void testNumsEmptyNums1() {
        int[] nums1 = {};
        int[] nums2 = {1};
        double result = obj.findMedianSortedArrays(nums1,nums2);
        double expected = 1.00000;
        assertEquals(expected, result);
    }

    @Test
    void testNumsEmptyNums2() {
        int[] nums1 = {2};
        int[] nums2 = {};
        double result = obj.findMedianSortedArrays(nums1,nums2);
        double expected = 2.00000;
        assertEquals(expected, result);
    }

    @Test
    void testNumsBothEmpty() {
        int[] nums1 = {};
        int[] nums2 = {};
        double result = obj.findMedianSortedArrays(nums1,nums2);
        double expected = 0.00000;
        assertEquals(expected, result);
    }

    @Test
    void testNumsComplex() {
        int[] nums1 = {1};
        int[] nums2 = {2,3,4};
        double result = obj.findMedianSortedArrays(nums1,nums2);
        double expected = 2.50000;
        assertEquals(expected, result);
    }
}