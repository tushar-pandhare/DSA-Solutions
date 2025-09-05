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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leftAns = new ArrayList<>();
        ArrayList<Integer> rightAns = new ArrayList<>();

        calculate(root1,leftAns);
        calculate(root2,rightAns);
        if(leftAns.size() != rightAns.size()) return false;
        for(int i=0;i<leftAns.size();i++){
            if (!leftAns.get(i).equals(rightAns.get(i))) return false;
        }
        return true;
    }
    public void calculate(TreeNode root,ArrayList<Integer> res){
        if(root == null) return;
        if(root.left == null && root.right == null){
            res.add(root.val);
            return;
        }
        calculate(root.left,res);
        calculate(root.right,res);
    }
}