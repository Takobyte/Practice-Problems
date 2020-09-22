package MedianSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;
        int num1,num2;
        int numsL1 = nums1.length;
        int numsL2 = nums2.length;
        int resultLength = nums1.length + nums2.length;
        int[] result = new int[resultLength];

        // return 0 if both arrays are empty
        if (resultLength == 0) {
            return 0.0000;
        }

        // merge two sorted arrays
        if (numsL1 <= 0 || numsL2 <= 0) {
            result = numsL1 > numsL2 ? nums1 : nums2;
        } else {
            for (int i = 0; i < resultLength; i++) {
                try {
                    num1 = nums1[i1];
                } catch (Exception e) {
                    try {
                        result[i] = nums2[i2];
                        i2++;
                        continue;
                    }
                    catch (Exception e1){
                        continue;
                    }
                }
                try {
                    num2 = nums2[i2];
                } catch (Exception e) {
                    try {
                        result[i] = nums1[i1];
                        i1++;
                        continue;
                    } catch(Exception e1) {
                        continue;
                    }
                }
                if (num1 <= num2) {
                    result[i] = nums1[i1];
                    i1++;
                } else {
                    result[i] = nums2[i2];
                    i2++;
                }
            }
        }

        // calculate median
        if (resultLength % 2 == 0) {
            int resultIndex = (resultLength / 2) - 1;
            double median = (result[resultIndex] + result[resultIndex + 1]) / 2.0;
            return median;
        } else {
            int resultIndex = (resultLength / 2);
            double median = result[resultIndex];
            return median;
        }
    }
}
