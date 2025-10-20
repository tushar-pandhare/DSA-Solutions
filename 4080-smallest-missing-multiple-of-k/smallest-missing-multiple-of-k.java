class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums) set.add(num);
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(i%k==0 && !set.contains(i)) return i;
        }
        return -1;
    }
}