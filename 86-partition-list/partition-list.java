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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1); // Before
        ListNode dummy2 = new ListNode(-1); // After

        ListNode temp1 = dummy1; 
        ListNode temp2 = dummy2;

        ListNode curr = head;

        while(curr != null){

            if(curr.val < x){
                temp1.next = curr;
                temp1 = temp1.next;
            }
            else{
                temp2.next = curr;
                temp2 = temp2.next;
            }
            curr=curr.next;
        }
        // LastNode
        temp2.next = null;
        temp1.next = dummy2.next;
        return dummy1.next;
    }
}