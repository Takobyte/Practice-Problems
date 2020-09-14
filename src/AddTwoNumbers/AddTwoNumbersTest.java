package AddTwoNumbers;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {
    Solution obj;

    @BeforeEach
    public void initialize() {
        obj = new Solution();
    }

    @Test
    public void testAddTwoLists() {
        ListNode l1 = new ListNode(3);
        ListNode l1n = new ListNode(4);
        ListNode l1nn = new ListNode(2);
        l1.next = l1n;
        l1n.next = l1nn;

        ListNode l2 = new ListNode(4);
        ListNode l2n = new ListNode(6);
        ListNode l2nn = new ListNode(5);
        l2.next = l2n;
        l2n.next = l2nn;
        ListNode listResult = obj.addTwoNumbers(l1, l2);

        ListNode listExpected = new ListNode(7);
        ListNode l3n = new ListNode(0);
        ListNode l3nn = new ListNode(8);
        listExpected.next = l3n;
        l3n.next = l3nn;
        assertEquals(listResult.val,listExpected.val);
        assertEquals(listResult.next.val,listExpected.next.val);
        assertEquals(listResult.next.next.val,listExpected.next.next.val);
    }
}