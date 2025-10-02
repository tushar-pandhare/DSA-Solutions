class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        ans[0]=-1;
        ans[1]=-1;

        int s =  0 ;
        int e = numbers.length-1;
        while(s < e){
            if(numbers[s]+numbers[e] == target){
                ans[0]=s+1;
                ans[1]=e+1;
                return ans;
            }

            else if(numbers[s] + numbers[e] < target){
                s = s+1;
            }

            else {
                e = e-1;
            }
        }
        return ans;
    }
}