class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        double avg=(double)sum/nums.length;
        int res=Math.max(1,(int)Math.floor(avg)+1); 

        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        while(set.contains(res)){
            res++;
        }
        return res;
    }
}
