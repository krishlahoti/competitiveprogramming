package org.example.linkedlist;

public class NthNodeFromEndOfLinkedList {

    public static void printNthFromLast(Node head, int n) {
        Node first = head;
        Node second = head;

        if(head == null){
            return;
        }

        for (int i = 0; i < n; i++) {

            if (first == null) {
                System.out.println("No such node exists");
                return;
            }
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println("Data: " + second.data);

    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printNthFromLast(head, 13);
    }
}
