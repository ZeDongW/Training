package cn.zedongw.a20210421;

import cn.zedongw.a20210420.ListNode;

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

    ListNode reverse(ListNode a) {
        ListNode pre, cur, nxt;
        pre = null; cur = a; nxt = a;
        while (cur != null) {
            nxt = cur.next;
            // 逐个结点反转
            cur.next = pre;
            // 更新指针位置
            pre = cur;
            cur = nxt;
        }
        // 返回反转后的头结点
        return pre;
    }

    ListNode reverseBetween(ListNode a, ListNode b) {
        ListNode pre, cur, nxt;
        pre = null; cur = a; nxt = a;
        // while 终止的条件改一下就行了
        while (cur != b) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        // 返回反转后的头结点
        return pre;
    }

    ListNode reverseGroup(ListNode head, int k) {
        if (head == null){
            return null;
        }
        // 区间 [a, b) 包含 k 个待反转元素
        ListNode a, b;
        a = b = head;
        for (int i = 0; i < k; i++) {
            // 不足 k 个，不需要反转，base case
            if (b == null){
                return head;
            }
            b = b.next;
        }
        // 反转前 k 个元素
        ListNode newHead = reverseBetween(a, b);
        // 递归反转后续链表并连接起来
        a.next = reverseGroup(b, k);
        return newHead;
    }

}
