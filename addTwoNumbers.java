/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) {
        this.val = val;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy head node
        ListNode current = dummy;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;
            
            carry = sum / 10;
            int digit = sum % 10;
            
            current.next = new ListNode(digit);
            current = current.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummy.next;
    }
    
    // Helper method to create a linked list from an array
    private ListNode createList(int[] nums) {
        if (nums.length == 0) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }
    
    // Helper method to print a linked list
    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: 342 + 465 = 807
        // Represented as [2,4,3] + [5,6,4] = [7,0,8]
        ListNode l1_1 = solution.createList(new int[]{2, 4, 3});
        ListNode l2_1 = solution.createList(new int[]{5, 6, 4});
        ListNode result1 = solution.addTwoNumbers(l1_1, l2_1);
        System.out.println("Test 1: [2,4,3] + [5,6,4] (342 + 465)");
        System.out.print("Output: ");
        solution.printList(result1); // Expected: [7,0,8]
        
        // Test case 2: 0 + 0 = 0
        ListNode l1_2 = solution.createList(new int[]{0});
        ListNode l2_2 = solution.createList(new int[]{0});
        ListNode result2 = solution.addTwoNumbers(l1_2, l2_2);
        System.out.println("\nTest 2: [0] + [0] (0 + 0)");
        System.out.print("Output: ");
        solution.printList(result2); // Expected: [0]
        
        // Test case 3: 9999999 + 9999 = 10009998
        // Represented as [9,9,9,9,9,9,9] + [9,9,9,9] = [8,9,9,9,0,0,0,1]
        ListNode l1_3 = solution.createList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2_3 = solution.createList(new int[]{9, 9, 9, 9});
        ListNode result3 = solution.addTwoNumbers(l1_3, l2_3);
        System.out.println("\nTest 3: [9,9,9,9,9,9,9] + [9,9,9,9] (9999999 + 9999)");
        System.out.print("Output: ");
        solution.printList(result3); // Expected: [8,9,9,9,0,0,0,1]
    }
}