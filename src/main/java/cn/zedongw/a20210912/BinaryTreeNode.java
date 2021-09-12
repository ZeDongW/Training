package cn.zedongw.a20210912;

/**
 * @ClassName BinaryTreeNode
 * @Description: 二叉树
 * @Author ZeDongW
 * @Date 2021/9/12
 * @Version V1.0
 * @ModifiedBy:
 * @ModifiedTime:
 **/
public class BinaryTreeNode {
    /**
     * 节点值
     */
    private int value;

    /**
     * 左子节点
     */
    private BinaryTreeNode left;

    /**
     * 右子节点
     */
    private BinaryTreeNode right;

    public BinaryTreeNode() {
    }

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

}
