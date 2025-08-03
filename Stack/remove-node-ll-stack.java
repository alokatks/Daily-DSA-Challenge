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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode>st=new Stack<>();
    ListNode current = head;
        
        // First pass: build stack with nodes in proper order
        while (current != null) {
            // Remove nodes from stack that are smaller than current
            while (!st.isEmpty() && st.peek().val < current.val) {
                st.pop();
            }
            st.push(current);
            current = current.next;
        }
        
        // Second pass: rebuild the list from stack
        ListNode newHead = null;
        while (!st.isEmpty()) {
            ListNode node = st.pop();
            node.next = newHead;
            newHead = node;
        }
        
        return newHead;
    }
}
