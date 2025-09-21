class Solution {
    int ans;
    public int kthAncestor(Node root, int k, int node) {
        ans=-1;
        solve(root,k,node);
        return ans;
    }
    
    public int solve(Node root, int k,int target){
        if(root==null) return -1;
        if(root.data==target) return 0;
        
        int left=solve(root.left,k,target);
        int right=solve(root.right,k,target);
        
        if(left==-1&&right==-1) return -1;
        
        int validSide = (left==-1)?right:left;
        if(validSide+1==k && ans==-1){
            ans=root.data;
        }
        return validSide+1;
    }
}