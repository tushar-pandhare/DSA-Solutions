class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean contain1=false;
        for(int i=0;i<n;i++){
            if(nums[i]==1) contain1=true;
            if(nums[i]<=0||nums[i]>n) nums[i]=1;
        }
        if(!contain1) return 1;
        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            if(num>=1&&num<=n){
                if(nums[num-1]>0) nums[num-1]*=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }
        return n+1;
    }
}
