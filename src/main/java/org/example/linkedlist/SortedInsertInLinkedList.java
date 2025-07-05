package org.example.linkedlist;

import static org.example.linkedlist.LinkedListUtil.printLinkedList;

public class SortedInsertInLinkedList {

    public static Node sortedInsertInLinkedList(Node head, int data) {

        Node curr = head;
        Node newNode = new Node(data);

        if(data < curr.data){
            newNode.next = curr;
            return newNode;
        }

        while(curr.next != null && curr.next.data < data){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printLinkedList(head);

        // Insert 5
        Node insert5 = sortedInsertInLinkedList(head, 5);
        printLinkedList(insert5);

        //Insert 25
        Node insert25 = sortedInsertInLinkedList(head, 25);
        printLinkedList(insert25);

        //Insert 60
        Node insert60 = sortedInsertInLinkedList(head, 60);
        printLinkedList(insert60);

    }
}
