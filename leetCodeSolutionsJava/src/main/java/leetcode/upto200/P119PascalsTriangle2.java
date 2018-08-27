package leetcode.upto200;

import leetcode.util.Utility;

import java.util.Arrays;
import java.util.List;

public class P119PascalsTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        Integer pascalTriangle[][] = new Integer[rowIndex+1][];
        for (int i = 0; i <= rowIndex; i++) {
            pascalTriangle[i] = new Integer[i+1];
        }

        int i =0;
        for (i = 0; i <= rowIndex; i++) {
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][pascalTriangle[i].length-1] = 1;
            for (int j = 1; j < pascalTriangle[i].length-1; j++) {
                pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
            }

        }
        return Arrays.asList(pascalTriangle[rowIndex]);
    }

    public static void main(String[] args) {
        P119PascalsTriangle2 solution = new P119PascalsTriangle2();
        Utility.printArray(solution.getRow(0));
        Utility.printArray(solution.getRow(1));
        Utility.printArray(solution.getRow(2));
        Utility.printArray(solution.getRow(3));
        Utility.printArray(solution.getRow(4));
        Utility.printArray(solution.getRow(5));
        Utility.printArray(solution.getRow(33));
    }
}
