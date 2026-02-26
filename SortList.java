class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    // Split the list into two parts, return head of second part
    private ListNode split(ListNode head, int size) {
        for (int i = 1; head != null && i < size; i++) {
            head = head.next;
        }
        if (head == null) return null;

        ListNode second = head.next;
        head.next = null;
        return second;
    }

    // Merge two sorted lists, return head of merged list
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Step 1: Get length
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 2: Bottom-up merge sort
        for (int size = 1; size < length; size *= 2) {
            ListNode curr = dummy.next;
            ListNode tail = dummy;

            while (curr != null) {
                ListNode left = curr;
                ListNode right = split(left, size);
                curr = split(right, size);

                tail.next = merge(left, right);

                // Move tail to the end of merged list
                while (tail.next != null) {
                    tail = tail.next;
                }
            }
        }

        return dummy.next;
    }
}