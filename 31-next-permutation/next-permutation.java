class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length-1;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverseArray(nums,0,nums.length-1);
            return;
        }
        for(int i=n;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }
        reverseArray(nums,pivot+1,n);
    }
    public void reverseArray(int[] nums,int start, int end) {
        while(start < end){
            int temp=nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;end--;
        }
    }
}