/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move fast to the end, maintaining the gap
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the nth node from the end
        ListNode temp = slow.next;
        slow.next = slow.next.next;

        // Java has garbage collection, so no need to free memory manually

        return dummy.next;
    }
}