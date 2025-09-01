class Solution {
    public int maxSubArray(int[] nums) {
        int end=0;
        int maxSum=nums[0],sum=0;
        while(end<nums.length){
            sum+=nums[end];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
            end++;
        }
        return maxSum;
    }
}