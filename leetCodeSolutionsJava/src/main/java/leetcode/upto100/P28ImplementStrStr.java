package leetcode.upto100;

public class P28ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if(isSubStringAt(haystack, i, needle)){
                return i;
            }
        }
        return -1;
    }

    private boolean isSubStringAt(String haystack, int i, String needle) {
        for (int j = i, k =0; k < needle.length() ; j++, k++) {
            if(j >= haystack.length())
                return false;
            char ch1 = haystack.charAt(j);
            char ch2 = needle.charAt(k);
            if(ch1 != ch2)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        P28ImplementStrStr solution = new P28ImplementStrStr();
        System.out.println(solution.strStr("hello","ll"));
        System.out.println(solution.strStr("aaaaa","ab"));
        System.out.println(solution.strStr("",""));
        System.out.println("".indexOf(""));
    }
}
