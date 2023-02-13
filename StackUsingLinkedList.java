package com.example.programs;
class StackAsLinkedList {
    StackNode root = null;
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // method to check whether the stack is empty or not
    boolean isEmpty() {
        return root == null;
    }

    // method to push data into the stack
    void push(int data) {
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
            return;
        }
        StackNode temp = root;
        root = newNode;
        newNode.next = temp;
    }

    // method to remove the element from the stack
    int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack Underflow");
            return popped;
        }
        popped = root.data;
        root = root.next;
        return popped;
    }

    // method to peek the top element
    int peek() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return root.data;
    }

    // method to print the stack
    void print() {
        if (root == null) {
            System.out.println("Empty stack");
            return;
        }
        while (root != null) {
            System.out.println(root.data);
            root = root.next;
        }
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackAsLinkedList stack = new StackAsLinkedList();

        stack.push(4);
        stack.push(4);
        stack.push(50);


        stack.print();

    }
}
