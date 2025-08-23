class MinimumNumberFromTwoArrays{
    public int minNumber(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        int smallestOne=Integer.MAX_VALUE;
        int smallestSec=Integer.MAX_VALUE;
        for(int num:nums1){
            smallestOne=Math.min(smallestOne,num);
            hs.add(num);
        }
        int res=Integer.MAX_VALUE;
        for(int num:nums2){
            if(hs.contains(num)){
                res= Math.min(res,num);
            }
            smallestSec=Math.min(smallestSec,num);
        }
        if(res!=Integer.MAX_VALUE){
            return res;
        }
        return Math.min(smallestOne*10+smallestSec,smallestSec*10+smallestOne);
    }
}
