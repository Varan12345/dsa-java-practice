package dsa;

public class remove_linked_lists {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next; // Move head to the next node if it matches the value
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node with the matching value
            } else {
                current = current.next; // Move to the next node
            }
        }

        return head; // Return the modified linked list
    }
}
