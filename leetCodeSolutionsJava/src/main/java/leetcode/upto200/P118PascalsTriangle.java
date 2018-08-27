package leetcode.upto200;

import leetcode.util.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        Integer pascalTriangle[][] = new Integer[numRows][];
        for (int i = 0; i < numRows; i++) {
            pascalTriangle[i] = new Integer[i+1];
        }

        for (int i = 0; i < numRows; i++) {
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][pascalTriangle[i].length-1] = 1;
            for (int j = 1; j < pascalTriangle[i].length-1; j++) {
                pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
            }
            result.add(Arrays.asList(pascalTriangle[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        P118PascalsTriangle solution = new P118PascalsTriangle();
        Utility.print(solution.generate(7));
    }
}
