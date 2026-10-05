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
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode copy = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = copy;

        while (t1 != null) {
            t2.next = new ListNode(t1.val);
            t1 = t1.next;
            t2 = t2.next;
        }

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode a = prev;
        ListNode b = copy;

        while(a!=null){
            if(a.val != b.val){
                return false;
            }
            a=a.next;
            b=b.next;
        }

        return true;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna