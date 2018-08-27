package leetcode.upto100;

import java.util.HashMap;
import java.util.Map;

public class Problem13RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanDigitToDecMap = new HashMap<>();
        romanDigitToDecMap.put('I',1);
        romanDigitToDecMap.put('V',5);
        romanDigitToDecMap.put('X',10);
        romanDigitToDecMap.put('L',50);
        romanDigitToDecMap.put('C',100);
        romanDigitToDecMap.put('D',500);
        romanDigitToDecMap.put('M',1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i+1 == s.length()){
                sum += romanDigitToDecMap.get(ch);
                break;
            }
            char nextCh = s.charAt(i+1);
            if(ch == 'I'){
                if(nextCh == 'V' || nextCh == 'X'){
                    sum += romanDigitToDecMap.get(nextCh) - romanDigitToDecMap.get(ch);
                    i++;
                }else {
                    sum += romanDigitToDecMap.get(ch);
                }
            }else if(ch == 'X'){
                if(nextCh == 'L' || nextCh == 'C'){
                    sum += romanDigitToDecMap.get(nextCh) - romanDigitToDecMap.get(ch);
                    i++;
                }else {
                    sum += romanDigitToDecMap.get(ch);
                }
            }else if(ch == 'C'){
                if(nextCh == 'D' || nextCh == 'M'){
                    sum += romanDigitToDecMap.get(nextCh) - romanDigitToDecMap.get(ch);
                    i++;
                }else {
                    sum += romanDigitToDecMap.get(ch);
                }
            }else{
                sum += romanDigitToDecMap.get(ch);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem13RomanToInteger solution = new Problem13RomanToInteger();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("IX"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
