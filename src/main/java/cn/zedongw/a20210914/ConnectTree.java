package cn.zedongw.a20210914;

import cn.zedongw.struct.TreeNode;

/**
 * @ClassName ConnectTree
 * @Description: TODO
 * @Author ZeDongW
 * @Date 2021/9/14
 * @Version V1.0
 * @ModifiedBy:
 * @ModifiedTime:
 **/
public class ConnectTree {
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    TreeNode node6 = new TreeNode(6);
    TreeNode node7 = new TreeNode(7);

    {
        node3.setLeft(node1);
        node3.setRight(node2);
        node6.setLeft(node5);
        node6.setRight(node7);
        node4.setLeft(node3);
        node4.setRight(node6);
    }

    public TreeNode connect(TreeNode root){
        if (root == null) {
            return null;
        }
        connectTwoNode(root.getLeft(), root.getRight());
        return root;
    }

    private void connectTwoNode(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return;
        }

        left.setNext(right);
        connectTwoNode(left.getLeft(), left.getRight());
        connectTwoNode(right.getLeft(), right.getRight());
        connectTwoNode(left.getRight(), right.getLeft());
    }

    public static void main(String[] args) {
        ConnectTree connectTree = new ConnectTree();
        connectTree.connect(connectTree.node4);
    }


}
