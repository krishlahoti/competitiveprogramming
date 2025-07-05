package org.example.linkedlist;

import static org.example.linkedlist.LinkedListUtil.getSortedLinkedListWithDuplicates;
import static org.example.linkedlist.LinkedListUtil.printLinkedList;

public class RemoveDuplicatesInSortedLinkedList {

    public static void removeDuplicates(Node head){
        Node curr = head;

        while(curr !=null && curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        Node head = getSortedLinkedListWithDuplicates();

        printLinkedList(head);

        removeDuplicates(head);

        printLinkedList(head);

    }


}
