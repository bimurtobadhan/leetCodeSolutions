package leetcode.util;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
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
