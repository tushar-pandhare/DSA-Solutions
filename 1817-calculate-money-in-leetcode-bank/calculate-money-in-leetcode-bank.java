class Solution {
    public int totalMoney(int n) {
        int ans=0, m=1;     
        while(n>0){
            for(int i=0;i< Math.min(n,7);i++){
                ans=ans+m+i;
            }
            m++;
            n=n-7;
        }
        return ans;
    }
}