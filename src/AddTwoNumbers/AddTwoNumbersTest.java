package AddTwoNumbers;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    AddTwoNumbers obj;

    @Before
    public void initialize() {
        obj = new AddTwoNumbers();
    }

    @Test
    public void testReverseList() {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        LinkedList listResult = obj.reverseList(list1);
        LinkedList listExpected = new LinkedList();
        list1.add(3);
        list1.add(2);
        list1.add(1);
        assertEquals(listExpected,listResult);
    }

    @Test
    public void testAddTwoLists() {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        LinkedList list2 = new LinkedList();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        LinkedList listResult = obj.addTwoLists(list1, list2);
        LinkedList listExpected = new LinkedList();
        listExpected.add(5);
        listExpected.add(7);
        listExpected.add(9);
        assertEquals(listExpected,listResult);
    }

    @Test
    public void testRemainerAdding() {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        LinkedList list2 = new LinkedList();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        LinkedList listResult = obj.addTwoLists(list1, list2);
        LinkedList listExpected = new LinkedList();
        listExpected.add(5);
        listExpected.add(8);
        listExpected.add(0);
        assertEquals(listExpected,listResult);
    }
}