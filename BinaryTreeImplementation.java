package com.example.datastructures;
// Program to implement the Binary Tree using the array
class BinaryTree {
    private final int[] tree;
    private int size;

    public BinaryTree(int capacity) {
        tree = new int[capacity];
        size = 0;
    }

    // Helper function to get the index of the left child node
    private int getIndexOfLeftChild(int i) {
        return i * 2 + 1;
    }

    // Helper function to get the index of the right child node
    private int getIndexOfRightChild(int i) {
        return i * 2 + 2;
    }

    // Helper function to get the value of the left child node
    private int getLeftChild(int i) {
        return tree[getIndexOfLeftChild(i)];
    }

    // Helper function to get the value of the right child node
    private int getRightChild(int i) {
        return tree[getIndexOfRightChild(i)];
    }

    // Helper function to insert at the next available index
    private void insertAtNextAvailablePosition(int value) {
        tree[size++] = value;
    }

    // Insert a value into the binary tree
    public void insert(int value) {
        if (size == tree.length) {
            throw new IllegalStateException("Tree is full");
        }
        insertAtNextAvailablePosition(value);
    }

    // print binary tree in pre-order traversal
    void preOrderTraversal() {
        preOrderTraversal(0);
    }
    void preOrderTraversal(int i) {
        if (i >= size) {
            return;
        }
        System.out.print(tree[i] + " ");
        preOrderTraversal(getIndexOfLeftChild(i));
        preOrderTraversal(getIndexOfRightChild(i));
    }


    // print binary Tree in in-order traversal
    void inOrderTraversal() {
        inOrderTraversal(0);
    }
    void inOrderTraversal(int i) {
        if (i >= size) {
            return;
        }
        inOrderTraversal(getIndexOfLeftChild(i));
        System.out.print(tree[i] + " ");
        inOrderTraversal(getIndexOfRightChild(i));
    }

    // print binary Tree in post-order traversal
    void postOrderTraversal() {
        postOrderTraversal(0);
    }
    void postOrderTraversal(int i) {
        if (i >= size) {
            return;
        }
        postOrderTraversal(getIndexOfLeftChild(i));
        postOrderTraversal(getIndexOfRightChild(i));
        System.out.print(tree[i] + " ");
    }
}
public class BinaryTreeImplementation {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree(20);

        bTree.insert(1);
        bTree.insert(2);
        bTree.insert(3);
        bTree.insert(4);
        bTree.insert(5);
        bTree.insert(6);
        bTree.insert(7);

        System.out.println("Pre-Order Traversal");
        bTree.preOrderTraversal();
        System.out.println();

        System.out.println("In-order Traversal");
        bTree.inOrderTraversal();
        System.out.println();

        System.out.println("Post-order Traversal");
        bTree.postOrderTraversal();


    }
}
