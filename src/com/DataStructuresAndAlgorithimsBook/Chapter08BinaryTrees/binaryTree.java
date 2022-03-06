package com.DataStructuresAndAlgorithimsBook.Chapter08BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {

    private TreeNode root;

    public static class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    /***
     * Creates a binary tree
     *
     *                 Root
     *                  1
     *               ~     ~
     *             2         3
     *           ~   ~         ~
     *          4     5        NULL
     *          Null   Null
     */
    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;

    }

    public void preorder(TreeNode Treenode) {
        if (Treenode == null) {
            return;
        }
        System.out.println(Treenode.value + " ");
        preorder(Treenode.left);
        preorder(Treenode.right);
    }

    public void inorder(TreeNode Treenode) {
        if (Treenode == null) {
            return;
        }
        inorder(Treenode.left);
        System.out.println(Treenode.value + " ");
        inorder(Treenode.right);
    }

    public void postorder(TreeNode Treenode) {
        if (Treenode == null) {
            return;
        }
        inorder(Treenode.left);
        inorder(Treenode.right);
        System.out.println(Treenode.value + " ");
    }

    public void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            System.out.println(tempNode.value + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        binaryTree bt = new binaryTree();

        bt.createBinaryTree();
        System.out.println("Preorder traversal");
        bt.preorder(bt.root);
        System.out.println("In order traversal");
        bt.inorder(bt.root);
        System.out.println("post order traversal");
        bt.postorder(bt.root);
        System.out.println("Level order traversal");
        bt.levelOrder(bt.root);
    }
}

