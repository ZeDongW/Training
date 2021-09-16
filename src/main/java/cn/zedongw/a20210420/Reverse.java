package cn.zedongw.a20210420;

import cn.zedongw.struct.ListNode;

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
     * @return: cn.zedongw.struct.ListNode
     * @author: ZeDongW
     * @date: 2021/4/21 0021 20:42
     */
    public ListNode reverse(ListNode head) {
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
     * @return: cn.zedongw.struct.ListNode
     * @author: ZeDongW
     * @date: 2021/4/21 0021 20:42
     */
    public ListNode reverseN(ListNode head, int index){
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
     * @return: cn.zedongw.struct.ListNode
     * @author: ZeDongW
     * @date: 2021/4/21 0021 20:43
     */
    public ListNode reverseBetween(ListNode head, int m, int n){
        if (m == 1){
            return reverseN(head, n);
        }

        head.next = reverseBetween(head.next, m-1, n-1);

        return head;
    }
}
