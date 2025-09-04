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
        Set<ListNode> even=new LinkedHashSet<>();
        Set<ListNode> odd=new LinkedHashSet<>();
        ListNode dummy=new ListNode(-1),temp=head;
        dummy.next=head;
        int count=0;
        while(temp!=null){
            if(count%2==0){
                even.add(temp);
            }
            else{
                odd.add(temp);
            }
            temp=temp.next;
            count++;
        }
        ListNode dummyPtr= dummy;
        for(ListNode newNode : even){
            dummyPtr.next = newNode;
            dummyPtr=dummyPtr.next;
        }
        for(ListNode newNode : odd){
            dummyPtr.next = newNode;
            dummyPtr=dummyPtr.next;
        }
        dummyPtr.next=null;
        return dummy.next;
    }
}