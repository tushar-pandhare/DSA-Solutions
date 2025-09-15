class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        boolean visited[]=new boolean[nums.length];
        solve(nums,ans,temp,visited);
        return ans;
    }
    public void solve(int[] nums,List<List<Integer>> ans,List<Integer> temp,boolean[] visited){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i])continue;
            if(i>0 && nums[i]==nums[i-1] && !visited[i-1])continue;
            visited[i]=true;
            temp.add(nums[i]);
            solve(nums,ans,temp,visited);
            temp.remove(temp.size()-1);
            visited[i]=false;

        }
    }
}