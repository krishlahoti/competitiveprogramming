package org.example.linkedlist;

import static org.example.linkedlist.LinkedListUtil.printLinkedList;

public class SwapKthNodeFromEnds {

    public static Node swapKthNode(Node head, int k) {
        // code here

        if (head == null) {
            return null;
        }

        int count = 0;
        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        if (count < k) {
            return head;
        }

        if (2 * k - 1 == count) {
            return head;
        }

        Node prevX = null, x = head;

        for (int i = 1; i < k; i++) {
            prevX = x;
            x = x.next;
        }

        Node prevY = null, y = head;

        for (int i = 1; i < count - k + 1; i++) {
            prevY = y;
            y = y.next;
        }

        if (prevX != null) prevX.next = y;
        if (prevY != null) prevY.next = x;

        Node tempNext = x.next;
        x.next = y.next;
        y.next = tempNext;

        if (k == 1) head = y;
        if (k == count) head = x;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printLinkedList(head);
        Node afterSwapHead = swapKthNode(head, 1);
        printLinkedList(afterSwapHead);
    }


}
