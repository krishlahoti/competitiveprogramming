package org.example.linkedlist;

public class InsertAtBeginningOfList {

    public static Node insertAtBeginningOfList(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

}
