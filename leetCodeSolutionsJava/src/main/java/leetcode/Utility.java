package leetcode;

import java.util.StringTokenizer;

public class Utility {
    public static ListNode processInput(String numberInString){
        StringTokenizer tokenizer = new StringTokenizer(numberInString," ");
        ListNode startNode = new ListNode(Integer.parseInt(tokenizer.nextToken()));
        ListNode result = startNode;
        while(tokenizer.hasMoreTokens()){
            ListNode node = new ListNode(Integer.parseInt(tokenizer.nextToken()));
            startNode.next = node;
            startNode = startNode.next;
        }
        startNode.next = null;
        return result;
    }
}
