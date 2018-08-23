package leetcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem21MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode finalResult = null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                if(result == null){
                    result = new ListNode(l1.val);
                    finalResult = result;
                }else{
                    result.next = new ListNode(l1.val);
                    result = result.next;
                }
                l1 = l1.next;
            }else{
                if(result == null){
                    result = new ListNode(l2.val);
                    finalResult = result;
                }else{
                    result.next = new ListNode(l2.val);
                    result = result.next;
                }
                l2 = l2.next;
            }

        }
        if(l1 == null && l2 != null){
            result.next = l2;
        }else if(l2 == null && l1 != null){
            result.next = l1;
        }
        return finalResult;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Problem21MergeTwoSortedList solution = new Problem21MergeTwoSortedList();
        File file = new File("inputs/21.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()) {
            ListNode firstInput = Utility.processInput(input.nextLine());
            System.out.println(firstInput);
            ListNode secondInput = Utility.processInput(input.nextLine());
            System.out.println(secondInput);
            System.out.println(solution.mergeTwoLists(firstInput, secondInput));
        }
    }
}
