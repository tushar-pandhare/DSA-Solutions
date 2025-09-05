class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        helper(root, 0);
        return res;
    }
    public void helper(TreeNode root, int level) {
        if(root==null) return;
        if(res.size()==level) res.add(root.val);
        helper(root.right,level+1);
        helper(root.left,level+1);
    }
}
