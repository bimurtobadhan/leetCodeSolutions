package leetcode.upto200;

import leetcode.util.ListNode;
import leetcode.util.Utility;

public class P141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode singleJumpIndex = head;
        ListNode doubleJumpIndex = head;
        while(true){
            if(singleJumpIndex == null || doubleJumpIndex == null)
                return false;

            singleJumpIndex = singleJumpIndex.next;

            if(doubleJumpIndex.next == null)
                return false;
            else doubleJumpIndex = doubleJumpIndex.next.next;

            if(singleJumpIndex == doubleJumpIndex)
                return true;
        }
    }

    public static void main(String[] args) {
        P141LinkedListCycle solution = new P141LinkedListCycle();
        ListNode listNode = Utility.processInput("1 2 3");
        listNode.next.next.next = listNode;
        System.out.println(solution.hasCycle(listNode));
    }
}
