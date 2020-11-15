package ReverseInteger;

public class Solution {
    public int reverse(int x) {
        int result = 0;
        int neg = 0;
        if (x < 0) {
            neg = -1;
        } else {
            neg = 1;
        }
        x = Math.abs(x);
        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            if (result == 0) {
                result = temp;
            } else {
                try {
                    result = Math.addExact(Math.multiplyExact(result,10), temp);
                } catch (ArithmeticException e) {
                    result = 0;
                    x = 0;
                }
            }
        }

        return result * neg;
    }
}
