class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;          // move slow by 1
        fast = fast.next.next;     // move fast by 2

        if (slow == fast) {
            return true;           // cycle detected
        }
    }

    return false;                  // no cycle
}