package leetcode.upto100;

import java.io.File;
import java.util.*;

/**
 * Created by bimurto on 1/8/17.
 */
public class Problem3 {
    private static String FILE_NAME = "inputs/3.txt";

    public int lengthOfLongestSubstring(String s) {
        int currentResult = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean alphabetIndex[] = new boolean[300];
            int startIndex = i;
            int subStringLength = 0;
            for (int j = startIndex; j < s.length(); j++) {
                char ch = s.charAt(j);
                int index = (int)ch;
                if(alphabetIndex[index])
                    break;
                else {
                    alphabetIndex[index] = true;
                    subStringLength++;
                }
            }
            if(subStringLength > currentResult) {
                currentResult = subStringLength;
            }
        }
        return currentResult;
    }

    public static void main(String[] args) throws Exception {
        Problem3 solution = new Problem3();
        Scanner input = new Scanner(new File(FILE_NAME));
        while(input.hasNext()){
            System.out.println(solution.lengthOfLongestSubstring(input.nextLine()));
        }
    }
}
