class Solution {
    HashSet<Integer> set=new HashSet<>();
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int src=edge[0];
            int dest=edge[1];
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        for(int i=0;i<V;i++){
            if(!set.contains(i)){
                if(dfs(adj,i,-1)) return true;
            }
        }
        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,int node,int parent){
        set.add(node);
        for(int newNode:adj.get(node)){
            if(!set.contains(newNode)){
                if(dfs(adj,newNode,node)) return true;
            }
            else if(newNode!=parent) return true;
        }
        return false;
    }
}