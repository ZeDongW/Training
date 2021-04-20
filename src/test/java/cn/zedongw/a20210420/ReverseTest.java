package cn.zedongw.a20210420;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    ListNode node6 = new ListNode(6);
    ListNode node5 = new ListNode(5, node6);
    ListNode node4 = new ListNode(4, node5);
    ListNode node3 = new ListNode(3, node4);
    ListNode node2 = new ListNode(2, node3);
    ListNode node1 = new ListNode(1, node2);

    Reverse re = new Reverse();

    @Test
    public void reverse() {
        printNode(node1);
        printNode(re.reverse(node1));
    }

    @Test
    public void reverseN() {
        printNode(node1);
        printNode(re.reverseN(node1,2));
    }

    @Test
    public void reverseBetween() {
        printNode(node1);
        printNode(re.reverseBetween(node1,3,4));
    }

    public void printNode(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node.next != null) {
            sb.append(node.val);
            sb.append("->");
            node = node.next;
        }
        sb.append(node.val);
        System.out.println(sb.toString());
    }
}