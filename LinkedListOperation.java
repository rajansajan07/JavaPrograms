package com.example.javaprojects;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class NodeList {
    Node head;
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
public class LinkedListOperation {

    // method to create an random list
    public static NodeList createNodeList(int n) {
        NodeList list = new NodeList();
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.floor(Math.random() * 21));
            if (i % 2 == 0) list.addFirst(num);
            else list.addLast(num);
        }
        return list;
    }
    // method to swap the node value
    public static void swapNodes(Node node1, Node node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

    // method to sort the linked list
    public static void sortNodeList(NodeList list, int N) {
        for (int i = 0; i < N - 1; i++) {
            Node current = list.head;
            for (int j = 0; j < N - i - 1; j++) {
                if (current.data > current.next.data) {
                    swapNodes(current, current.next);
                }
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        NodeList list = createNodeList(10);

        list.printList();

        // sort the linked list
        sortNodeList(list, 10);
        list.removeFirst();
        list.removeLast();
        list.printList();
    }

}
