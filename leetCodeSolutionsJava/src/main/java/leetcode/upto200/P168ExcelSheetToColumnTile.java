package leetcode.upto200;

public class P168ExcelSheetToColumnTile {
    public String convertToTitle(int n) {
        String result = "";
        while(n>0){
            int rem = (n%26==0)?26:n%26;
            int ascii = (int) 'A' - 1 + rem;
            result = (char) ascii + result;
            n = (n-1)/26;
        }
        return result;
    }

    private char numberToChar(int n){
        return (char)n;
    }

    public static void main(String[] args) {
        P168ExcelSheetToColumnTile solution = new P168ExcelSheetToColumnTile();
        System.out.println(solution.convertToTitle(1406));
        for (int i = 26*27 + 1; i <= 26*28; i++) {
            System.out.println(i+ " " +solution.convertToTitle(i));
        }
    }
}
