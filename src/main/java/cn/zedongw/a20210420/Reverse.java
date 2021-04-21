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

    /**
     * Description: 反转整个链表
     * @methodName: reverse
     * @param head 1
     * @throws
     * @return: cn.zedongw.a20210420.ListNode
     * @author: ZeDongW
     * @date: 2021/4/21 0021 20:42
     */
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

    /**
     * Description: 反转前n个链表
     * @methodName: reverseN
     * @param head 1
     * @param index 2
     * @throws
     * @return: cn.zedongw.a20210420.ListNode
     * @author: ZeDongW
     * @date: 2021/4/21 0021 20:42
     */
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

    /**
     * Description: 反转m到n之间的链表
     * @methodName: reverseBetween
     * @param head 1
     * @param m 2
     * @param n 3
     * @throws
     * @return: cn.zedongw.a20210420.ListNode
     * @author: ZeDongW
     * @date: 2021/4/21 0021 20:43
     */
    ListNode reverseBetween(ListNode head, int m, int n){
        if (m == 1){
            return reverseN(head, n);
        }

        head.next = reverseBetween(head.next, m-1, n-1);

        return head;
    }
}
