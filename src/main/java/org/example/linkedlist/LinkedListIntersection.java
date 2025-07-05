package org.example.linkedlist;

public class LinkedListIntersection {

    public static Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) return null;

        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        // Either intersection node or null if no intersection
        return p1;
    }

    public static void printIntersection(Node node) {
        if (node != null)
            System.out.println("Intersection at node with data: " + node.data);
        else
            System.out.println("No intersection found.");
    }

    public static void main(String[] args) {
        // Shared part
        Node intersect = new Node(8);
        intersect.next = new Node(10);

        // First list: 3 -> 7 -> 8 -> 10
        Node headA = new Node(3);
        headA.next = new Node(7);
        headA.next.next = intersect;

        // Second list: 99 -> 1 -> 8 -> 10
        Node headB = new Node(99);
        headB.next = new Node(1);
        headB.next.next = intersect;

        Node result = getIntersectionNode(headA, headB);
        printIntersection(result);  // Should print 8
    }


}
