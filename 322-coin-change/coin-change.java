class Solution {

    // int ans=Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        int result;
        Integer dp[] = new Integer[amount+1];
        result = solve(coins,amount,dp);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int solve(int[] coins , int amount , Integer[] dp){
        if(amount == 0){
            return 0;
        }

        if(amount < 0) return Integer.MAX_VALUE;
        
        if(dp[amount]!=null) return dp[amount];

        int ans=Integer.MAX_VALUE;
        for(int coin : coins){
            int temp = solve(coins , amount-coin , dp);
            if(temp != Integer.MAX_VALUE){
                ans = Math.min(ans , temp+1);
            }
        }
        return dp[amount] = ans;
    }
}