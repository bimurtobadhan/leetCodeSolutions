package leetcode.upto100;

public class P67AddBinary {
    public String addBinary(String a, String b) {
        if(a.length() > b.length()){
            String fill = "";
            for (int i = 0; i < a.length()-b.length(); i++) {
                fill += "0";
            }
            b = fill + b;
        }else if(b.length() > a.length()){
            String fill = "";
            for (int i = 0; i < b.length()-a.length(); i++) {
                fill += "0";
            }
            a = fill + a;
        }
        int carry = 0;
        String result = "";
        for (int i = a.length() -1; i >= 0; i--) {
            int cha = Integer.parseInt("" + a.charAt(i));
            int chb = Integer.parseInt("" + b.charAt(i));
            int intResult = (cha + chb + carry) % 2;
            carry = (cha + chb + carry) / 2;
            result = intResult + result;
        }
        if(carry > 0)
            result = carry + result;
        return result;
    }

    public static void main(String[] args) {
        P67AddBinary solution = new P67AddBinary();
        System.out.println(solution.addBinary("110000","1"));
        System.out.println(solution.addBinary("1010","1011"));
        System.out.println(solution.addBinary("11","1"));
    }
}
