package cn.zedongw.a20210421;

import cn.zedongw.struct.ListNode;
import org.junit.Test;

public class TraverseTest {

    ListNode node6 = new ListNode(1);
    ListNode node5 = new ListNode(2, node6);
    ListNode node4 = new ListNode(3, node5);
    ListNode node3 = new ListNode(3, node4);
    ListNode node2 = new ListNode(2, node3);
    ListNode node1 = new ListNode(1, node2);

    Traverse tr = new Traverse();

    @Test
    public void traverse1() {
        node1.toString(node1);
        tr.traverse1(node1);
    }

    @Test
    public void traverse() {
        node1.toString(node1);
        System.out.println(tr.isPalindrome(node1));
    }
}