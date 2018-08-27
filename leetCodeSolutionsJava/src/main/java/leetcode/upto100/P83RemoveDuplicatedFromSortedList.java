package leetcode.upto100;

import leetcode.util.ListNode;
import leetcode.util.Utility;

public class P83RemoveDuplicatedFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode temp = head;
        while(temp.next != null){
            if(temp.val == temp.next.val){
                if(temp.next.next != null){
                    temp.next = temp.next.next;
                }else{
                    temp.next = null;
                }
            }else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        P83RemoveDuplicatedFromSortedList solution = new P83RemoveDuplicatedFromSortedList();
        ListNode head = Utility.processInput("");
        System.out.println(solution.deleteDuplicates(head));
    }
}
