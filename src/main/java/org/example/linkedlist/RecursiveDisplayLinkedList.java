package org.example.linkedlist;

import static org.example.linkedlist.InsertAtBeginningOfList.insertAtBeginningOfList;
import static org.example.linkedlist.InsertAtEndOfLinkedList.insertAtEndOfLinkedList;
import static org.example.linkedlist.InsertionAtGivenPoint.insertAt;

public class RecursiveDisplayLinkedList {

    public static void recursivePrint(Node head) {
        if (head == null) {
            return;
        }

        System.out.println(head.data + " ");
        recursivePrint(head.next);
    }

    public static void reversePrint(Node head) {
        if (head.next == null) {
            System.out.println(head.data + " ");
            return;
        }
        reversePrint(head.next);
        System.out.println(head.data + " ");

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

        recursivePrint(head);

        System.out.println("-------------------------------");
        reversePrint(head);

        head = insertAtBeginningOfList(head, 60);

        System.out.println("-------------After Inserting at the start------------------");

        recursivePrint(head);

        head = insertAtEndOfLinkedList(head, 70);

        System.out.println("-------------After Inserting at the end------------------");

        recursivePrint(head);

        head = insertAt(head, 2, 80);

        System.out.println("-------------After Inserting at index 2------------------");

        recursivePrint(head);

    }
}
