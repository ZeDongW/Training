package cn.zedongw.a20210915;

/**
 * @ClassName Flatten
 * @Description: 把一棵二叉树拉平成一条链表
 * @Author ZeDongW
 * @Date 2021/9/15
 * @Version V1.0
 * @ModifiedBy:
 * @ModifiedTime:
 **/
public class Flatten {
    BinaryTreeNode node1 = new BinaryTreeNode(1);
    BinaryTreeNode node2 = new BinaryTreeNode(2);
    BinaryTreeNode node3 = new BinaryTreeNode(3);
    BinaryTreeNode node4 = new BinaryTreeNode(4);
    BinaryTreeNode node5 = new BinaryTreeNode(5);
    BinaryTreeNode node6 = new BinaryTreeNode(6);
    BinaryTreeNode node7 = new BinaryTreeNode(7);

    {
        node2.setLeft(node1);
        node2.setRight(node3);
        node6.setLeft(node5);
        node6.setRight(node7);
        node4.setLeft(node2);
        node4.setRight(node6);
    }

    public void flatten(BinaryTreeNode root){
        if (root == null) {
            return;
        }

        flatten(root.getLeft());
        flatten(root.getRight());

        BinaryTreeNode left = root.getLeft();
        BinaryTreeNode right = root.getRight();

        root.setLeft(null);
        root.setRight(left);

        BinaryTreeNode temp = root;
        while (temp.getRight() != null) {
            temp = temp.getRight();
        }

        temp.setRight(right);
    }

    public static void main(String[] args) {
        Flatten flatten = new Flatten();
        flatten.flatten(flatten.node4);
        System.out.println();
    }
}
