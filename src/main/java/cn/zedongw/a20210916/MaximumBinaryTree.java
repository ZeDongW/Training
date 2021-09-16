package cn.zedongw.a20210916;

import cn.zedongw.struct.BinaryTreeNode;

/**
 * @ClassName MaximumBinaryTree
 * @Description: 根据数组构造最大二叉树
 * @Author ZeDongW
 * @Date 2021/9/16
 * @Version V1.0
 * @ModifiedBy:
 * @ModifiedTime:
 **/
public class MaximumBinaryTree {

    public BinaryTreeNode buildMaximumBinaryTree(int[] arr, int start, int end){
        if (start > end){
            return null;
        }

        int index = start;
        int max = arr[start];

        for (int i = start; i <= end; i++) {
            if (max < arr[i]){
                index = i;
                max = arr[i];
            }
        }

        BinaryTreeNode root = new BinaryTreeNode(max);
        root.setLeft(buildMaximumBinaryTree(arr, start, index -1));
        root.setRight(buildMaximumBinaryTree(arr, index +1, end));

        return root;
    }

    public static void main(String[] args) {
        MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();
        int[] arr = {3,2,1,6,0,5};
        BinaryTreeNode binaryTreeNode = maximumBinaryTree.buildMaximumBinaryTree(arr, 0, arr.length-1);
        System.out.println();
    }

}
