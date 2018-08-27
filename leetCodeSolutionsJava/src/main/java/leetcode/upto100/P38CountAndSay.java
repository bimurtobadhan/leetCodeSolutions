package leetcode.upto100;

public class P38CountAndSay {
    public String countAndSay(int n) {
        String start="1";
        if(n == 1)
            return start;
        for (int i = 1; i < n; i++) {
            StringBuilder result = new StringBuilder();
            int counter[] = new int[10];
            int lastIntValue = Integer.parseInt(start.charAt(0) + "");
            counter[lastIntValue] += 1;
            for (int j = 1; j < start.length(); j++) {
                char ch = start.charAt(j);
                int intValue = Integer.parseInt(""+ch);
                if(lastIntValue != intValue){
                    result.append(counter[lastIntValue]).append(lastIntValue);
                    counter[lastIntValue] = 0;

                    lastIntValue = intValue;
                }
                counter[intValue] += 1;
            }
            result.append(counter[lastIntValue]).append(lastIntValue);
            start = result.toString();
        }
        return start;
    }

    public static void main(String[] args) {
        P38CountAndSay solution = new P38CountAndSay();

        for (int i = 1; i <= 10; i++) {
            System.out.println(solution.countAndSay(i));
        }
    }
}
