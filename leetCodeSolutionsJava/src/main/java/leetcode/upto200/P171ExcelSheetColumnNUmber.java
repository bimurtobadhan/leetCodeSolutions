package leetcode.upto200;

public class P171ExcelSheetColumnNUmber {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int charValue = (int) s.charAt(i) - (int) 'A' + 1;
            result = result + charValue * (int) Math.pow(26, s.length()-1-i);
        }
        return result;
    }

    public static void main(String[] args) {
        P171ExcelSheetColumnNUmber solution = new P171ExcelSheetColumnNUmber();
        System.out.println(solution.titleToNumber("AAB"));
        System.out.println(solution.titleToNumber("BBB"));
        System.out.println(solution.titleToNumber("AA"));
        System.out.println(solution.titleToNumber("ZZ"));

    }
}
