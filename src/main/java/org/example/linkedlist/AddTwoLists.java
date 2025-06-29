package org.example.linkedlist;

import java.math.BigInteger;

public class AddTwoLists {

    static Node addTwoLists(Node num1, Node num2) {
        // code here

        StringBuilder s1 = new StringBuilder();

        while (num1 != null) {
            s1.append(num1.data);
            num1 = num1.next;
        }

        StringBuilder s2 = new StringBuilder();

        while (num2 != null) {
            s2.append(num2.data);
            num2 = num2.next;
        }

        BigInteger n1 = new BigInteger(s1.toString());
        BigInteger n2 = new BigInteger(s2.toString());
        BigInteger sum = n1.add(n2);

        String sumStr = sum.toString();

        Node head = null;
        Node tail = null;

        for (char c : sumStr.toCharArray()) {
            Node newNode = new Node(c - '0');
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;

    }

    static Node addTwoListsOptimized(Node num1, Node num2) {
        // code here
        num1 = reverse(num1);
        num2 = reverse(num2);

        Node dummy = new Node(0);
        Node tail = dummy;

        int carry = 0;

        while (num1 != null || num2 != null || carry != 0) {
            int sum = carry;

            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }

            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }

            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            tail.next = newNode;
            tail = newNode;

        }

        return removeLeadingZero(reverse(dummy.next));

    }

    static Node removeLeadingZero(Node head) {
        while (head != null && head.data == 0 && head.next != null) {
            head = head.next;
        }

        return head;
    }


    static Node reverse(Node head) {
        Node prev = null, curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
