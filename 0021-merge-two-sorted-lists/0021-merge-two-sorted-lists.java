/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to form the new sorted list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Pointers to iterate through list1 and list2
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        
        // Traverse both lists and compare each node
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                current.next = cur1;
                cur1 = cur1.next;
            } else {
                current.next = cur2;
                cur2 = cur2.next;
            }
            current = current.next;
        }
        
        // If there are remaining nodes in list1, append them
        if (cur1 != null) {
            current.next = cur1;
        }
        
        // If there are remaining nodes in list2, append them
        if (cur2 != null) {
            current.next = cur2;
        }
        
        // The first node is the dummy node, so return the next node
        return dummy.next;
    }
}