/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public int getLen(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }

        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        int countA = getLen(headA);
        int countB = getLen(headB);

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while(countA > countB){
            countA--;
            nodeA = nodeA.next;
        }

        while(countA < countB){
            countB--;
            nodeB = nodeB.next;
        }


        while(nodeA != null){
            if(nodeA == nodeB){
                return nodeA;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return null;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna