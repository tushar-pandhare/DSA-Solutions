class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // if(nums.length==1) return (double)nums[0];
        int start = 0 , end = start;
        double maxSum=-Double.MAX_VALUE,sum=0;

        while(end<nums.length){
            sum+=nums[end];
            if((end-start+1)==k){
                maxSum = Math.max(maxSum , sum);
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return maxSum/k;
    }
}