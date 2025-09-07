class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        if(n%2==1){
            res[0]=0;
            int x=(n/2);
            for(int i=1;i<=x;i++){
                res[i]=-i;
                res[i+x]=i;
            }
        }
        else{
            for(int i=0;i<n/2;i++){
                res[i]=i+1;
                res[i+n/2]=-(i+1);
            }
        }
        return res;
    }
}