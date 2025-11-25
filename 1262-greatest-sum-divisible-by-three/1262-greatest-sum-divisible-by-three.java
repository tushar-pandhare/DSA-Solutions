class Solution {
    public int maxSumDivThree(int[] nums) {
        int[][] dp=new int[nums.length][3];

        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }

        int ans=solve(nums,0,0,dp);
        return ans==Integer.MIN_VALUE?0:ans;
    }


    public int solve(int[] nums, int index, int rem, int[][] dp){
        if(index==nums.length){
            if(rem==0){
                return 0;
            }
            return Integer.MIN_VALUE;
        }
        if(dp[index][rem]!=Integer.MIN_VALUE){
            return dp[index][rem];
        }

        int take= nums[index]+solve(nums,index+1, (rem+nums[index])%3 , dp);
        int notTake = solve(nums, index+1, rem, dp);

        return dp[index][rem]=Math.max(take,notTake);
    }
}