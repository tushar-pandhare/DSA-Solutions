class Solution {
    int goodCount;
    public int goodNodes(TreeNode root) {
        goodCount=0;
        helperFunction(root,Integer.MIN_VALUE);
        return goodCount;
    }
    public void helperFunction(TreeNode root ,int prevMax){
        if(root == null) return;

        if(root.val >= prevMax) goodCount++;
        prevMax = Math.max(prevMax , root.val);
        helperFunction(root.left,prevMax);
        helperFunction(root.right,prevMax); 
    }
}