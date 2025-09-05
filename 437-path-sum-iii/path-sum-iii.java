class Solution {
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        helperFunction(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
    }
    public void helperFunction(TreeNode root,int target,long sum){
        if(root == null) return;
        sum+=root.val;
        if(sum==target) count+=1;
        helperFunction(root.left,target,sum);
        helperFunction(root.right,target,sum);
        
    }
}