class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            TreeNode newNode=getMax(root.left);
            root.val=newNode.val;
            root.left=deleteNode(root.left,newNode.val);
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else{
            root.right=deleteNode(root.right,key);
        }
        return root;
    }
    public TreeNode getMax(TreeNode root){
        while(root.right!=null) root=root.right;
        return root;
    }
}