package leetcode.upto100;

public class Problem14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0)
            return prefix;
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                try {
                    if(ch != strs[j].charAt(i)){
                        return prefix;
                    }
                } catch (IndexOutOfBoundsException e) {
                    return prefix;
                }
            }
            prefix += ch;
        }
        return prefix;
    }

    public static void main(String[] args) {
        Problem14LongestCommonPrefix solution = new Problem14LongestCommonPrefix();
//        String [] strs = new String[]{"flower","flow","flight"};
//        String [] strs = new String[]{};
        String [] strs = new String[]{"dog"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
