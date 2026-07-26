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
    public int length(ListNode head){
        if(head == null){
            return 0;
        }
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }

        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        ListNode A = headA;
        ListNode B = headB;

        int lenA = length(headA);
        int lenB = length(headB);

        while(lenA>lenB){
            A=A.next;
            lenA--;
        }

        while(lenB>lenA){
            B=B.next;
            lenB--;
        }

        while (A != null && B != null) {

            if (A == B) {
                return A;
            }

            A = A.next;
            B = B.next;
        }

        return null;


    }
}