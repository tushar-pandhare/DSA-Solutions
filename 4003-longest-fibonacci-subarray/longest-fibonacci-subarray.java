class Solution {
    public int longestSubarray(int[] nums) {
        int maxi=2;
        int curr=2;
        for(int i=3-1;i+1<=nums.length;++i){
            if(nums[i-1]+nums[i-2]==nums[i]){
                maxi=Math.max(++curr,maxi);
            }
            else
                curr=2;
        }
        return maxi;
    }
}