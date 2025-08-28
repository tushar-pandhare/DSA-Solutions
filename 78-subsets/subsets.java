class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        generate(nums,ans,new ArrayList<>(),0);
        return ans;
    }
    public void generate(int[] nums,List<List<Integer>> ans,List<Integer> curr,int start){
        if(start>=nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        ans.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            generate(nums,ans,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}