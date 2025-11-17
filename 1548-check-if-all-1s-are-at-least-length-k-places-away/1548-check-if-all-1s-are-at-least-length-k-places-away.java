class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        // boolean away = true;
        int count=0;
        int oneCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(i!=0 && oneCount!=0){
                    if(count<k){
                        return false;
                    }
                }
                oneCount++;
                count=0;
            }
            else{
                count++;
            }
        }
        return true;
    }
}