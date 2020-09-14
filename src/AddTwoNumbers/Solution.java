package AddTwoNumbers;

public class Solution {

    Solution() {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add_one = 0;
        int k = 0;
        ListNode result = new ListNode();
        ListNode result_curr = result;
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        while(curr1 != null || curr2 != null) {
            int i = (curr1 != null) ? curr1.val : 0;
            int j = (curr2 != null) ? curr2.val : 0;
            k = i + j + add_one;
            if (k > 9) {
                k = k - 10;
                add_one = 1;
            } else {
                add_one = 0;
            }
            result_curr.next = new ListNode(k);
            result_curr = result_curr.next;
            if (curr1 != null) {curr1 = curr1.next;}
            if (curr2 != null) {curr2 = curr2.next;}
        }
        if (add_one == 1) {
            result_curr.next = new ListNode(add_one);
        }
        return result.next;
    }
}