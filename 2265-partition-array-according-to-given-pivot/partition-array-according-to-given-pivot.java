class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        List<Integer> great=new ArrayList<>();
        for(int num: nums){
            if(num == pivot){
                equal.add(pivot);
            }
            else if(num > pivot){
                great.add(num);
            }
            else{
                less.add(num);
            }
        }

        int[] ans= new int[nums.length];
        int idx= 0;
        for(int num: less) ans[idx++] = num;
        for(int num: equal) ans[idx++] = num;
        for(int num: great) ans[idx++] = num;
        return ans;
    }
}