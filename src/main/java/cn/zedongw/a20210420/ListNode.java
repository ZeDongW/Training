package cn.zedongw.a20210420;

/**
 * @ClassName: ListNode
 * @Description: node节点
 * @Author: ZeDongW
 * @Date: 2021/4/20 0020 20:32
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
