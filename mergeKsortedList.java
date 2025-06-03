import java.util.PriorityQueue;

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

public class mergeKsortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // Min Heap (PriorityQueue)
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        // Add first node of each list
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {
            // Get smallest node
            ListNode minNode = minHeap.poll();
            tail.next = minNode;
            tail = tail.next;

            // Add next node from same list
            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }

        return dummy.next;
    }
}