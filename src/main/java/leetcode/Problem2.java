package leetcode;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by bimurto on 1/7/17.
 */
public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null, start = null;
        int carry = 0;
        while(l1 != null || l2 != null){
            int a,b,sum;
            if(l1 != null){
                a = l1.val;
                l1 = l1.next;
            }else{
                a = 0;
            }
            if(l2 != null){
                b = l2.val;
                l2 = l2.next;
            }else{
                b = 0;
            }
            sum = (a+b+carry)%10;
            carry = (a+b+carry)/10;
            if(start == null){
                start = new ListNode(sum);
                result = start;
            }else{
                start.next = new ListNode(sum);
                start = start.next;
            }
        }
        if (carry != 0){
            start.next = new ListNode(carry);
        }
        return result;
    }

    private ListNode processInput(String numberInString){
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

    public static void main(String[] args) throws Exception {
        Problem2 solution = new Problem2();
        File file = new File("inputs/2.txt");
        System.out.println(file.exists());
        Scanner input = new Scanner(file);
        String firstInput = input.nextLine();
        ListNode l1 = solution.processInput(firstInput);
        System.out.println(l1);
        String secondInput = input.nextLine();
        ListNode l2 = solution.processInput(secondInput);
        System.out.println(l2);
        ListNode result = solution.addTwoNumbers(l1,l2);
        System.out.println(result);
    }
}


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
     }

    @Override
    public String toString() {
        ListNode self = this;
        String result = "" + val;
        while(self.next != null){
            self = self.next;
            result += "->" +self.val;
        }
        return result;
    }
}

