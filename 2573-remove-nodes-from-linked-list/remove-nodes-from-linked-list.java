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
        head= reverse(null, head);
        ListNode temp,curr;

        curr = head;
        temp = head.next;
        
        while(temp!= null){
            if(temp.val >= curr.val){
                curr.next = temp;
                curr= curr.next;
            }
            temp=temp.next;
        }
        curr.next= null;

        return reverse(null, head);
    }

    public ListNode reverse(ListNode prev, ListNode curr){
        ListNode fut;
        while(curr != null){
            fut= curr.next;
            curr.next= prev;
            prev= curr;
            curr= fut;

            // curr= curr.next;
        }
    return prev;
    }
}