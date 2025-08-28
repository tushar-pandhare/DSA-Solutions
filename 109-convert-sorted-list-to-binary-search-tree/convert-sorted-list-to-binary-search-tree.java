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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return helperFunction(head,null);
    }
    public TreeNode helperFunction(ListNode head,ListNode tail){
        if(head ==tail) return null;
        ListNode mid =head;
        ListNode midNext =head;
        while(midNext != tail && midNext.next != tail){
            mid= mid.next;
            midNext =midNext.next.next;
        }
        TreeNode root=new TreeNode(mid.val);
        root.left= helperFunction(head,mid);
        root.right= helperFunction(mid.next,tail);
        return root;
    }
}