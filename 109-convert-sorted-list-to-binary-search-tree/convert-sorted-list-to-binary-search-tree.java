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
        if(head == null)return null;
        ArrayList<Integer> tempList=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            tempList.add(temp.val);
            temp=temp.next;
        }
        return buildBST(tempList,0,tempList.size()-1);
    }

    private TreeNode buildBST(ArrayList<Integer>nums,int left,int right){
        if(left>right)return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums.get(mid));
        root.left=buildBST(nums,left,mid-1);
        root.right=buildBST(nums,mid+1,right);
        return root;
    }
}
