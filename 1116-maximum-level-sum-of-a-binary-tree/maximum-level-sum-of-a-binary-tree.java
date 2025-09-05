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
    public int maxLevelSum(TreeNode root) {
        int maxSum=Integer.MIN_VALUE;
        int level=1;
        int maxLevel=1;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int sum=0;
            while(size-->0){
                TreeNode top=queue.peek();
                sum+=queue.poll().val;
                if(top.left!=null){
                    queue.offer(top.left);
                }
                if(top.right!=null){
                    queue.offer(top.right);
                }
            }
            if(maxSum<sum){
                maxSum=sum;
                maxLevel=level;
            }
            level++;
        }
        return maxLevel;
    }
}