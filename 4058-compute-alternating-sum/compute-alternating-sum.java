class Solution {
    public int alternatingSum(int[] nums) {
        int c=0;
        int res=0;
        for(int i : nums){
            if(c++%2==0){
                res+=i;
            }
            else{
                res-=i;
            }
        }
        return res;
    }
}