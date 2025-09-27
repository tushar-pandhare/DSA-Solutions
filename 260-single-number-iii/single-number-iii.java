class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int n: nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        int i=0;
        for(int key:freq.keySet()){
            if(freq.get(key)==1){
                ans[i++]=key;
            }
        }
        return ans;
    }
}