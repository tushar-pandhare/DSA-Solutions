class Solution {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
        solve(root,ans,"");
        for(String num:ans){
            sum+=Integer.parseInt(num);
        }
        return sum;
    }
    public void solve(TreeNode root,ArrayList<String> ans,String path){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            ans.add(path+root.val);
            return;
        }
        solve(root.left,ans,path+root.val);
        solve(root.right,ans,path+root.val);
    }
}