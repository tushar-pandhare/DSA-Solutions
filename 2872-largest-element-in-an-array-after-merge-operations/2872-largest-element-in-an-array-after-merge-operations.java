class Solution {
    long maxi=Long.MIN_VALUE;
    long temp;
    public long maxArrayValue(int[] nums) {
        temp=nums[nums.length-1];
        if(nums.length==1) return nums[0];
        int right=nums.length-1;
        while(right>=1){
            if(nums[right-1]<=temp){
                temp+=nums[right-1];
            }
            else{
                temp=nums[right-1];
            }
            maxi=Math.max(maxi,temp);
            right--;
        }
        // maxi=Math.max(maxi,nums[0]);
        return maxi;
    }
}