/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution{
    int res=Integer.MIN_VALUE;
    int findMaxSum(Node root){
        solve(root);
        return res;
    }
    public int solve(Node root){
        if(root==null) return 0;
        int leftVal=0,rightVal=0;
        leftVal= Math.max(leftVal,solve(root.left));
        rightVal= Math.max(rightVal,solve(root.right));
        res=Math.max(res,root.data+leftVal+rightVal);
        return root.data+Math.max(leftVal,rightVal);
    }
}
