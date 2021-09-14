package cn.zedongw.a20210914;

/**
 * @ClassName TreeNode
 * @Description: 完美二叉树
 * @Author ZeDongW
 * @Date 2021/9/14
 * @Version V1.0
 * @ModifiedBy:
 * @ModifiedTime:
 **/
public class TreeNode {
    /**
     * 节点值
     */
    private int value;

    /**
     * 左子节点
     */
    private TreeNode left;

    /**
     * 右子节点
     */
    private TreeNode right;

    /**
     * 下一节点
     */
    private TreeNode next;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getNext() {
        return next;
    }

    public void setNext(TreeNode next) {
        this.next = next;
    }
}
