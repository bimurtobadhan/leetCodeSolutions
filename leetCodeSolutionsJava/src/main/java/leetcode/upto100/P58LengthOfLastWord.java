package leetcode.upto100;

public class P58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int last_word_length = 0;
        boolean startCounting = false;
        boolean foundFirstSpace = false;
        boolean lastCharWasSpace = false;
        boolean isCounting = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if( !startCounting && ch != ' ') {
                startCounting = true;
                isCounting = true;
            }else if(!startCounting){
                continue;
            }
            if(ch == ' '){
                lastCharWasSpace = true;
                if(!foundFirstSpace){
                    foundFirstSpace = true;
                    last_word_length = count;
                }
                if(isCounting){
                    last_word_length = count;
                    isCounting = false;
                }
                count = 0;
                continue;
            }
            if(lastCharWasSpace && ch != ' '){
                lastCharWasSpace = false;
                isCounting = true;
            }
            if(isCounting){
                count++;
            }
            if(isCounting && i == s.length() -1){
                last_word_length = count;
            }

        }
        return last_word_length;
    }

//    public int lengthOfLastWord(String s) {
//        int count = 0;
//        int last_word_length = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(ch == ' ' || i == s.length() -1){
//                if(i == s.length() -1 && ch != ' '){
//                    count++;
//                }
//                if(i>=1 && s.charAt(i-1) != ' ') {
//                    last_word_length = count;
//                }
//                count = 0;
//            }else {
//                count++;
//            }
//        }
//        return last_word_length;
//    }

    public static void main(String[] args) {
        P58LengthOfLastWord solution = new P58LengthOfLastWord();
        System.out.println(solution.lengthOfLastWord("Hello      World!!"));
        System.out.println(solution.lengthOfLastWord("Hello  World!!     "));
        System.out.println(solution.lengthOfLastWord("Hello"));
        System.out.println(solution.lengthOfLastWord("   Hello       "));
        System.out.println(solution.lengthOfLastWord("    "));
        System.out.println(solution.lengthOfLastWord("a"));
    }
}
