class Solution {
    public int[] sortedSquares(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int num:nums){
            map.put(num*num,map.getOrDefault(num*num,0)+1);
        }
        int i=0;
        for(int key:map.keySet()){
            int num=map.get(key);
            while(num-->0){
                nums[i++]=key;
            }
        }
        return nums;
    }
}