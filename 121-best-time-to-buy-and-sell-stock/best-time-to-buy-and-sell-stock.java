class Solution {
    public int maxProfit(int[] nums){
	    int minPrice=nums[0];
	    int maxProf=0;
	    for(int i=1;i<nums.length;i++){
	        maxProf=Math.max(maxProf,nums[i]-minPrice);
	        minPrice=Math.min(minPrice,nums[i]);
	    }
	    return maxProf;
	}
}