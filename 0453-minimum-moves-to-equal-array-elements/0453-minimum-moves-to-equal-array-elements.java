class Solution {
    public int minMoves(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int sum=0;
        for(int num: nums){
            mini=Math.min(mini,num);
            sum+=num;
        }
        long res=(long)mini*nums.length;
        return (int)sum-(int)res;
    }
}