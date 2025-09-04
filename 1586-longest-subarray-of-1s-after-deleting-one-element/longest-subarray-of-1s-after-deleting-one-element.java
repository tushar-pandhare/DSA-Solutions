class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count++;       
        }
        if(count==0) return nums.length-1;
        int[] arr=new int[count+1];
        int idx=0;
        int start=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[idx++]=sum;
                sum=0;
            }
            else{
                sum+=1;
            }
        }
        arr[idx++]=sum;
        
        int maxSum=0;
        for(int i=0;i<arr.length-1;i++){
            maxSum=Math.max(maxSum,arr[i]+arr[i+1]);
        }
        return maxSum==nums.length?maxSum-1:maxSum;
    }
}