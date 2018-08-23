package leetcode;

public class ListNode {
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
