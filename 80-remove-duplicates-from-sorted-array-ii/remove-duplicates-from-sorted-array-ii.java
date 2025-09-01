class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int key:map.keySet()){
            if(map.get(key)>=2){
                nums[count++]=key;
                nums[count++]=key;
            }
            else{
                nums[count++]=key;
            }
        }
        return count;
    }
}