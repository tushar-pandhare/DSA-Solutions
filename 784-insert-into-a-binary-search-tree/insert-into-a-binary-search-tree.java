class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode=new TreeNode(val);
        if(root==null) return newNode;
        solve(root,newNode);
        return root;
    }
    public void solve(TreeNode root,TreeNode newNode){
        if(root.val>newNode.val){
            if(root.left==null){
                root.left=newNode;
            }
            else{
                solve(root.left,newNode);
            }
        }
        else{
            if(root.right==null){
                root.right=newNode;
            }
            else{
                solve(root.right,newNode);
            }
        }
    }
}