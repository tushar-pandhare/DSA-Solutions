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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> que= new LinkedList<>();
        List<Double> ans= new ArrayList<>();
        levelOrder(que,root,ans);
        return ans;
    }

    public void levelOrder(Queue<TreeNode> que,TreeNode root,List<Double> ans){
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> temp= new ArrayList<>();
            int size=que.size();
            int l=size;
            double sum=0.0;
            while(size-->0){
                TreeNode node= que.poll();
                sum+=node.val;
                if(node.left!=null) que.offer(node.left);
                if(node.right!=null) que.offer(node.right);
            }
            double res=(double)sum/l;
            ans.add(res);
        }
    }
}