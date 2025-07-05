package org.example.linkedlist;

import static org.example.linkedlist.LinkedListUtil.printLinkedList;

public class ReverseLinkedList {


    public static Node reverseLinkedListRecursively(Node head) {

        if(head == null || head.next == null){
            return head;
        }

        Node restHead = reverseLinkedListRecursively(head.next);
        Node restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;


    }
    public static Node reverseLinkedList(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node curr = head;
        Node prev = null;


        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printLinkedList(head);
        Node reversedLinkedList = reverseLinkedList(head);
        printLinkedList(reversedLinkedList);
        Node originalLinkedList = reverseLinkedListRecursively(reversedLinkedList);
        printLinkedList(originalLinkedList);
    }
}
