package com.example.datastructures;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    Node root = null;
    Node parent = null;

    // method to insert the into the BinarySearchTree
    void insert(int data) {
        Node newNode = new Node(data);

        // if the root is null
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            while (true) {
                parent = focusNode;
                if (data < focusNode.data) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // method to return the height of BinarySearchTree
    int height(Node focusNode) {
        if (focusNode == null) {
            return 0;
        } else {
            int leftDepth = height(focusNode.left);
            int rightDepth = height(focusNode.right);

            // use the larger one
            return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
        }
    }

    // method to print the given level
    void printGivenLevel(Node focusNode, int level) {
        if (focusNode == null) {
            return;
        }
        if (level == 1) {
            System.out.print(focusNode.data + " ");
        }
        printGivenLevel(focusNode.left, level - 1);
        printGivenLevel(focusNode.right, level - 1);
    }

    // method to print the whole BinarySearchTree
    void printLevelOrder(Node focusNode) {
        int h = height(focusNode);
        for (int i = 1; i <= h; i++) {
            printGivenLevel(focusNode, i);
            System.out.println();
        }
    }

    // method to preOrderTraversal
    void preOrderTraversal(Node focusNode) {
        if (focusNode != null) {
            System.out.print(focusNode.data + " -- ");
            preOrderTraversal(focusNode.left);
            preOrderTraversal(focusNode.right);
        }
    }
}

public class BinarySearchTreeImplementation {
    public static void main(String[] args) {
        BinarySearchTree bTree = new BinarySearchTree();

        bTree.insert(50);
        bTree.insert(30);
        bTree.insert(20);
        bTree.insert(40);
        bTree.insert(70);
        bTree.insert(60);
        bTree.insert(80);
//        bTree.insert(10);
//        bTree.insert(25);
//        bTree.insert(27);

        bTree.preOrderTraversal(bTree.root);
        System.out.println();
        System.out.println("Height of the BinarySearchTree: " + bTree.height(bTree.root));
        bTree.printLevelOrder(bTree.root);
    }
}
