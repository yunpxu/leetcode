package cn.yunpxu.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by yunpxu on 2017/3/31.
 */
public class _104MaxDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode _0 = new TreeNode(0);
        TreeNode _1 = new TreeNode(1);
        TreeNode _2 = new TreeNode(2);
        TreeNode _3 = new TreeNode(3);
        TreeNode _4 = new TreeNode(4);
        _0.setLeft(_1);
        _0.setRight(_2);
        _1.setLeft(_3);
        _3.setLeft(_4);

        System.out.println(maxDepth2(_0));

    }

    public static int maxDepth2(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            while (size > 0) {
                TreeNode current = queue.poll();
                TreeNode left = current.getLeft();
                TreeNode right = current.getRight();
                if (left != null) {
                    queue.add(left);
                }
                if (right != null) {
                    queue.add(right);
                }
                size--;
            }
        }
        return depth;
    }

    public static int maxDepth(TreeNode root) {
        int[] result = new int[]{0};
        depth(root, 1, result);
        return result[0];
    }

    public static void depth(TreeNode node, int i, int[] result) {
        if (node == null) {
            return;
        }
        TreeNode left = node.getLeft();
        TreeNode right = node.getRight();
        if (left != null || right != null) {
            i++;
        }
        if (left != null) {
            depth(left, i, result);
        }
        if (right != null) {
            depth(right, i, result);
        }
        result[0] = Math.max(result[0], i);
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    TreeNode(int x) {
        val = x;
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

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
