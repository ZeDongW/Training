package cn.zedongw.struct;

/**
 * @ClassName: ListNode
 * @Description: 链表node节点
 * @Author: ZeDongW
 * @Date: 2021/4/20 0020 20:32
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void toString(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node.next != null) {
            sb.append(node.val);
            sb.append("->");
            node = node.next;
        }
        sb.append(node.val);
        System.out.println(sb);
    }
}
