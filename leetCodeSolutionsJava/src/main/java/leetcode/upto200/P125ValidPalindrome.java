package leetcode.upto200;

public class P125ValidPalindrome {
    public boolean isPalindrome(String s) {
        int j = s.length() -1;
        int i = 0;
        while(true){
            if(i>=s.length() || j< 0)
                break;
            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(j));
            if(!isAlphaNumeric(ch1) ){
                i++;
                continue;
            }
            if(!isAlphaNumeric(ch2)){
                j--;
                continue;
            }
            if(ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }

        while(i<s.length()){
            char ch1 = s.charAt(i);
            if( !isAlphaNumeric(ch1) ){
                i++;
            }else{
                return false;
            }
        }

        while(j >= 0){
            char ch1 = s.charAt(j);
            if( !isAlphaNumeric(ch1) ){
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

    private boolean isAlphaNumeric(char ch){
        if(Character.isDigit(ch) || Character.isAlphabetic(ch)){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        P125ValidPalindrome solution = new P125ValidPalindrome();
//        System.out.println(solution.isPalindrome(""));
        System.out.println(solution.isPalindrome("                8  A man, a plan, a canal: Panama      8"));
//        System.out.println(solution.isPalindrome("race a car"));
    }
}
