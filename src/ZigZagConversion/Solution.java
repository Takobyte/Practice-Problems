package ZigZagConversion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    // function outputs String ordered from top row left and right to bottom row
    // numRows signifies the maximum row zigzag conversion will have
    public String convert(String s, int numRows) {
        int n = s.length(); // length of the loop
        int numCol = -1;
        int direction  = 1; // 1 = up, 0 = down
        LinkedList<String[]> zigzag = new LinkedList<String[]>();

        int currIndex = 0;
        while(currIndex < n) {
            zigzag.add(new String[numRows]);
            numCol++;
            for(int j = 0; j < numRows && currIndex < n; j++) {
                if(direction == 1) {
                    zigzag.get(numCol)[j] = String.valueOf(s.charAt(currIndex));
                    if (j == numRows - 1) {
                        direction = 0;
                    }
                    currIndex++;
                } else {
                    zigzag.get(numCol)[j + (numRows - numCol - 1)] = String.valueOf(s.charAt(currIndex));
                    currIndex++;
                    j = numRows;
                    if (numRows - numCol - 1 == 1) {
                        direction = 1;
                    }
                }
            }
        }

        String result = "";
//        for(int i = 0; i < numRows; i++) {
//            for(int j = 0; j < numCol; j++) {
//                result = result.concat(zigzag[i][j]);
//            }
//        }

        return result;
    }
}
