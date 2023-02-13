package com.example.javaprojects;
class Stack {
    final static int MAX = 1000;
    int top;
    int[] st = new int[MAX];

    Stack() {
        top = -1;
    }

    // method to check whether the stack is empty
    boolean isEmpty() {
        return top < 0;
    }

    // method to push into the stack
    void push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        st[++top] = x;
    }

    // method to pop() element from the stack
    void pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return;
        }
        int x = st[top--];
        System.out.println(x + " removed from top");
    }

    // peek the top element
    int peek() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        return st[top];
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(st[i]);
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.print();

        System.out.println(stack.isEmpty());
    }
}
