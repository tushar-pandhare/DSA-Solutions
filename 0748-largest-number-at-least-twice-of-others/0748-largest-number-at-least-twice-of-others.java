class Solution {
    public int dominantIndex(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int idx=0,count=0;
        for(int num: nums){
            if(maxi<num){
                maxi=num;
                idx=count;
            }
            ++count;
        }

        for(int num:nums){
            if(num!=maxi && num*2 > maxi){
                return -1;
            }
        }
        return idx;
    }
}