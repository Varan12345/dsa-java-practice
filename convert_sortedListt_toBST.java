import java.util.*;
class Solution {
    public treeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        c
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (prev != null) {
            prev.next = null; 
        }
        
        treeNode root = new treeNode(slow.val);
        root.left = sortedListToBST(head); // Left half
        root.right = sortedListToBST(slow.next); // Right half
        
        return root;
        //
    }           
}
