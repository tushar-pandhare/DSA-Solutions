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
    int maxLength=0;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        // boolean leftDir=true;
        helperFunction(root,true,0);
        helperFunction(root,false,0);
        return maxLength;
    }
    public void helperFunction(TreeNode root,boolean left,int len){
        if(root==null){
            return;
        }
        maxLength=Math.max(maxLength,len);
        if(left){
            helperFunction(root.right,false,len+1);
            helperFunction(root.left,true,1);
        }
        else{
            helperFunction(root.left,true,len+1);
            helperFunction(root.right,false,1);
        }
    }
}