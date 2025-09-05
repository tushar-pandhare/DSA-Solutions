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
    List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        HashSet<Integer> set=new HashSet<>();
        // set.add(0);
        traverse(root,set,0);
        return res;
    }
    public void traverse(TreeNode root,HashSet<Integer> set,int level){
        if(root==null) return;
        if(set.add(level)){
            res.add(root.val);
        }
        traverse(root.right,set,level+1);
        traverse(root.left,set,level+1);  
    }
}