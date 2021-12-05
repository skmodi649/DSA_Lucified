package com.company;

// Program to select a random node from a Binary tree

import java.lang.*;

class Opengenus_random_treeNode
{
    static class TreeNode
    {
        int val;
        int child;
        TreeNode left, right;
    }

    static TreeNode Node(int data)
    {
        TreeNode temp = new TreeNode();
        temp.val = data;
        temp.left = temp.right = null;   //No child initially for the Binary tree
        temp.child = 0;
        return temp;
    }

    static int getChild(TreeNode root)
    {
        if (root == null)
            return 0;
        return getChild(root.left) +
                getChild(root.right) + 1;
    }

    // the following function just counts the number of children for a given root
    static TreeNode ChildCount(TreeNode root)
    {
        if (root == null)
            return null;

        root.child = getChild(root) - 1;
        root.left = ChildCount(root.left);
        root.right = ChildCount(root.right);
        return root;
    }

    // returns number of children for a particular root of the binary tree
    static int children(TreeNode root)
    {
        if (root == null)
            return 0;
        return root.child + 1;
    }

    //The following function is basically used to return the required random node of the binary tree
    static int randomNodeUtil(TreeNode root, int count)
    {
        if (root == null)
            return 0;

        if (count == children(root.left))
            return root.val;

        if (count < children(root.left))
            return randomNodeUtil(root.left, count);

        return randomNodeUtil(root.right,
                count - children(root.left) - 1);
    }

    // Returns Random node
    static int randomNode(TreeNode root)
    {

        int index = (int) (Math.random() * (root.child + 1));
        return randomNodeUtil(root, index);
    }


    public static void main(String[] asdf)
    {
        //Now let's create the binary Tree

        TreeNode root = Node(1);
        root.left = Node(2);
        root.right = Node(3);
        root.left.right = Node(12);
        root.left.right = Node(89);
        root.right.left = Node(68);
        root.right.right = Node(99);
        root.right.left = Node(68);

        ChildCount(root);

        System.out.println( "Random Node : " +
                randomNode(root));
    }
}

