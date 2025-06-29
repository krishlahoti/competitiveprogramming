package org.example.linkedlist;

public class InsertionAtGivenPoint {

    public static Node insertAt(Node head, int index, int data) {

        Node temp = new Node(data);

        if (index == 1) {
            temp.next = head;
            return temp;
        }

        Node curr = head;

        for (int i = 1; i <= index - 2 && curr!= null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }

        temp.next = curr.next;
        curr.next = temp;

        return head;
    }
}
