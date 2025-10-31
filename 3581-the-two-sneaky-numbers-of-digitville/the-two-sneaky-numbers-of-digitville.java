class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        HashSet<Integer> set=new HashSet<>();
        int idx=0;
        for(int num: nums){
            if(!set.add(num)){
                ans[idx++]=num;
            }
            
            if(idx==2) return ans;
        }
        return ans;
    }
}