package cn.zedongw.a20210420;

import cn.zedongw.a20210420.ListNode;

import java.net.BindException;

/**
 * @ClassName: Reverse
 * @Description: 翻转链表
 * @Author: ZeDongW
 * @Date: 2021/4/20 0020 20:38
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Reverse {

    ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    ListNode succcessor = null;

    ListNode reverseN(ListNode head, int index){
        if (index == 1){
            succcessor = head.next;
            return head;
        }

        ListNode last = reverseN(head.next, index-1);

        head.next.next = head;

        head.next = succcessor;

        return last;
    }

    ListNode reverseBetween(ListNode head, int m, int n){
        if (m == 1){
            return reverseN(head, n);
        }

        head.next = reverseBetween(head.next, m-1, n-1);

        return head;
    }
}
