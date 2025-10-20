class Solution {
    public int longestBalanced(int[] nums) {
        int maxi=0;
        for(int i=0; i<nums.length; i++){
            
            HashSet<Integer> evens=new HashSet<>();
            HashSet<Integer> odds=new HashSet<>();

            for(int j=i; j<nums.length; j++){
                if(nums[j]%2 == 0) evens.add(nums[j]);
                else odds.add(nums[j]);

                if(evens.size()==odds.size()) maxi=Math.max(maxi,j-i+1);
            }
        }
        return maxi;
    }
}