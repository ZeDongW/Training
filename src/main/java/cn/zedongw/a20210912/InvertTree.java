package cn.zedongw.a20210912;

import cn.zedongw.struct.BinaryTreeNode;

/**
 * @ClassName InvertTree
 * @Description: 镜像翻转二叉树
 * @Author ZeDongW
 * @Date 2021/9/12
 * @Version V1.0
 * @ModifiedBy:
 * @ModifiedTime:
 **/
public class InvertTree {

    BinaryTreeNode node1 = new BinaryTreeNode(1);
    BinaryTreeNode node2 = new BinaryTreeNode(2);
    BinaryTreeNode node3 = new BinaryTreeNode(3);
    BinaryTreeNode node4 = new BinaryTreeNode(4);
    BinaryTreeNode node5 = new BinaryTreeNode(5);
    BinaryTreeNode node6 = new BinaryTreeNode(6);
    BinaryTreeNode node7 = new BinaryTreeNode(7);

    {
        node3.setLeft(node1);
        node3.setRight(node2);
        node6.setLeft(node5);
        node6.setRight(node7);
        node4.setLeft(node3);
        node4.setRight(node6);
    }

    /**
     * Description: 镜像翻转二叉树
     * @methodName: invertTree
     * @param root 1
     * @return: cn.zedongw.struct.ListNode.BinaryTreeNode
     * @author: ZeDongW
     * @date: 2021/9/12 22:04
     */
    public BinaryTreeNode invertTree(BinaryTreeNode root){
        if (root == null) {
            return null;
        }

        BinaryTreeNode temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        invertTree(root.getLeft());
        invertTree(root.getRight());
        return root;
    }

    public static void main(String[] args) {
        InvertTree it = new InvertTree();
        it.invertTree(it.node4);
    }

}
