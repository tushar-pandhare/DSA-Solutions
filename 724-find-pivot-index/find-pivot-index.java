class Solution {
    public int pivotIndex(int[] nums) {
        int lSum[]= new int[nums.length];
        int rSum[]= new int[nums.length];

        lSum[0]=nums[0];
        for(int i=1;i<lSum.length;i++){
            lSum[i]=lSum[i-1]+nums[i];
        }
        rSum[rSum.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rSum[i]=rSum[i+1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(lSum[i]==rSum[i]) return i;
        }
        return -1;
    }
}