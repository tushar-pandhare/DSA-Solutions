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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyEven = new ListNode(-1);
        ListNode dummyOdd = new ListNode(-1);
        ListNode evenPtr = dummyEven,oddPtr = dummyOdd;

        int count=0;
        ListNode temp=head;

        while(temp!=null){
            ListNode front = temp.next;
            temp.next = null;
            if(count%2 == 0){
                evenPtr.next = temp;
                evenPtr = evenPtr.next;
            }
            else{
                oddPtr.next = temp;
                oddPtr = oddPtr.next;
            }
            count++;
            temp = front;
        }
        evenPtr.next=dummyOdd.next;
        oddPtr.next=null;
        return dummyEven.next;
    }
}