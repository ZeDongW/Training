package cn.zedongw.a20210421;

import cn.zedongw.struct.ListNode;

/**
 * @ClassName: Traverse
 * @Description: 回文链表
 * @Author: ZeDongW
 * @Date: 2021/4/21 0021 21:35
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Traverse {
    public void traverse1(ListNode head) {
        if (head == null){
            return;
        }
        traverse1(head.next);
        // 后序遍历代码
        System.out.print(head.val);
    }

    /**
     *
     */
    ListNode left;

    boolean isPalindrome(ListNode head) {
        left = head;
        return traverse(head);
    }

    boolean traverse(ListNode right) {
        if (right == null){
            return true;
        }
        boolean res = traverse(right.next);
        // 后序遍历代码
        res = res && (right.val == left.val);
        left = left.next;
        return res;
    }
}
