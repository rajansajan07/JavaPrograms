package com.example.programs;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    // add to the front of doublyLinkedList
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add to the last of doublyLinkedList
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
        newNode.prev = current;
    }

    // remove the first node
    void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // remove the last node
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

    // print the doublyLinkedList
    void printDoublyLinkedList() {
        Node current = head;

        System.out.print("NULL <- ");
        while (current.next != null) {
            System.out.print(current.data + " <--> ");
            current = current.next;
        }
        System.out.println(current.data + " -> NULL");
    }
}

public class DoublyLinkedListExample {
    // method to generate a doubly linked list
    public static DoublyLinkedList generateDoublyLinkedList(int n) {
        DoublyLinkedList dblist = new DoublyLinkedList();
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.floor(Math.random() * 21));
            dblist.addFirst(num);
        }
        return dblist;
    }

    // method to sort the doublyLinkedList
    public static void sort(DoublyLinkedList dblist, int N) {
        for (int i = 0; i < N - 1; i++) {
            Node current = dblist.head;
            for (int j = 0; j < N - i - 1; j++) {
                if (current.data > current.next.data) {
                    int data = current.data;
                    current.data = current.next.data;
                    current.next.data = data;
                }
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList dblist =generateDoublyLinkedList(10);

        dblist.printDoublyLinkedList();

        // sort the list
        sort(dblist, 10);

        dblist.printDoublyLinkedList();

        dblist.removeFirst();
        dblist.removeLast();
        dblist.printDoublyLinkedList();
    }
}
