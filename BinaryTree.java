package com.example.apple;

import java.util.LinkedList;
import java.util.Queue;

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
public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    // method to insert into the node
    public void insert(int data) {
        this.root = insertRecursive(this.root, data);
    }
    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    // method the check whether the data contains inside the tree or not
    public boolean contains(int data) {
        return containsRecursive(this.root, data);
    }
    private boolean containsRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (current.data == data) {
            return true;
        }
        return (current.data < data)
                ? containsRecursive(current.left, data)
                : containsRecursive(current.right, data);
    }

    // method to implement the pre-order traversal
    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }
    private void preOrderTraversal(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }

    // method to implement the level order traversal
    public void levelOrderTraversal() {
        if (this.root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    // Driver function
    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree();

        btree.insert(60);
        btree.insert(50);
        btree.insert(80);
        btree.insert(40);
        btree.insert(70);
        btree.insert(90);
        btree.insert(55);

        btree.preOrderTraversal();
        System.out.println();
        btree.levelOrderTraversal();

    }
}
