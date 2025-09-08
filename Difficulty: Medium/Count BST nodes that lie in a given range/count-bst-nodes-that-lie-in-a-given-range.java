/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    int count=0;
    int getCount(Node root, int l, int h) {
        if(root==null) return 0;
        if(root.data>=l&&root.data<=h){
            count++;
            getCount(root.left,l,h);
            getCount(root.right,l,h);
        }
        else if(root.data>h){
            getCount(root.left,l,h);
        }
        else{
            getCount(root.right,l,h);
        }
        return count;
    }
}