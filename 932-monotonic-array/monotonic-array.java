class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                flag=false;
                break;
            }
        }
        if(flag) return true;

        flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                flag=false;
                break;
            }
        }
        if(flag) return true;

        return false;

    }
}