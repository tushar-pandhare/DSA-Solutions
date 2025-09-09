class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            if(!set.contains(i)){
                solve(adj,set,ans,i);
            }
        }
        return ans;
    }
    public void solve(ArrayList<ArrayList<Integer>> adj,HashSet<Integer> set,ArrayList<Integer> ans,int node){
        set.add(node);
        ans.add(node);
        for(int newNode:adj.get(node)){
            if(!set.contains(newNode)){
                solve(adj,set,ans,newNode);
            }
        }
    }
}