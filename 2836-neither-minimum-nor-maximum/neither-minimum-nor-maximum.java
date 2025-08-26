class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<2) return -1;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int num:nums){
            if(num!=min&&num!=max) return num;
        }
        return -1;
    }
}