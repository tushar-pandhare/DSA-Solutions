class Solution {
    HashSet<Integer> set=new HashSet<>();
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] edges:connections){
            adj.get(edges[0]).add(edges[1]);
            adj.get(edges[1]).add(edges[0]);
        }

        int c=0;
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                dfs(i,adj);
                c++;
            }
        }
        return c-1;
    }
    public void dfs(int node,List<List<Integer>> adj){
        if(!set.add(node)) return;
        for(int newNode:adj.get(node)){
            dfs(newNode,adj);
        }
    }
}