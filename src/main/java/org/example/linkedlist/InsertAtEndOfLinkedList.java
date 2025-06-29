package org.example.linkedlist;

public class InsertAtEndOfLinkedList {

    public static Node insertAtEndOfLinkedList(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;

        return head;
    }
}
