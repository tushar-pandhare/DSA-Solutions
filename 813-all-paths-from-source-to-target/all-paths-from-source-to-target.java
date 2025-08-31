class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> tempRes = new ArrayList<>();
        helperFunction(graph,ans,tempRes,graph.length,0);
        return ans;
    }
    public void helperFunction(int[][] graph,List<List<Integer>> res, List<Integer> temp, int size , int curr){
        temp.add(curr);
        if(curr==size-1) res.add(new ArrayList<>(temp));
        else{
            for(int num:graph[curr]) helperFunction(graph,res,temp,size,num);
        }
        temp.remove(temp.size()-1);
    }
}