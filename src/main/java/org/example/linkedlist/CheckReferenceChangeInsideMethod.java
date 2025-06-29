package org.example.linkedlist;

import static org.example.linkedlist.RecursiveDisplayLinkedList.recursivePrint;

public class CheckReferenceChangeInsideMethod {


    public static void changeReference(Node head) {
        head.data = 70;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        head.next = second;
        Node third = new Node(30);
        second.next = third;
        Node fourth = new Node(40);
        third.next = fourth;
        Node fifth = new Node(50);
        fourth.next = fifth;

        changeReference(head);

        recursivePrint(head);


    }
}
