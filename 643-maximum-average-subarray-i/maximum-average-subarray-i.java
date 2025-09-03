class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0, end = 0;
        double sum = 0, maxSum = -Double.MAX_VALUE;
        while (end < nums.length) {
            sum += nums[end];
            if ((end - start + 1) == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return maxSum / k;
    }
}
