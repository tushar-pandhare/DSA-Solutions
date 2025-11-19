class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean present=false;
       for(int i=0;i<nums.length;i++){
            if(original==nums[i])   present=true;
       } 
       if(!present) return original;
        HashSet<Integer> set=new HashSet<>();
       if(present){
            for(int num: nums){
                set.add(num);
            }
       }
       while(set.contains(original)){
        original*=2;
       }
       return original;
    }
}