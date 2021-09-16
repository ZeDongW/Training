package cn.zedongw.a20210420;

import cn.zedongw.struct.ListNode;
import org.junit.Test;

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
        node1.toString(node1);
        node1.toString(re.reverse(node1));
    }

    @Test
    public void reverseN() {
        node1.toString(node1);
        node1.toString(re.reverseN(node1, 2));
    }

    @Test
    public void reverseBetween() {
        node1.toString(node1);
        node1.toString(re.reverseBetween(node1, 3, 4));
    }

}