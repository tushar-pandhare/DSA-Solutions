class Solution {
    public int nthRoot(int n, int m) {
        if(n==0) return 0;
        int low=1,high=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            int pow=power(n,mid,m);
            if(pow==m) return mid;
            else if(m>pow) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public int power(int x,int n,int m){
        int prod=1;
        for(int i=0;i<x;i++){
            prod*=n;
            if(prod>m)return prod;
        }
        return prod;
    }
}