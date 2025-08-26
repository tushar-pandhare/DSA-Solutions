class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex=0;
        int oddIndex=nums.length-1;
        while(evenIndex<nums.length && oddIndex>=0){
            // Check for even indexes if all the even indexes are containing even elements then all odd index elements must contain odd elements
            if(nums[evenIndex]%2==0) evenIndex+=2;
            else if(nums[oddIndex]%2==1) oddIndex-=2;
            else{
                int t1=nums[evenIndex];
                nums[evenIndex]=nums[oddIndex];
                nums[oddIndex]=t1;
            }
        }
        return nums;
    }
}