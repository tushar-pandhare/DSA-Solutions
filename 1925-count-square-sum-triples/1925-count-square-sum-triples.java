class Solution {
    public int countTriples(int n) {
        int c=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j) continue;
                int res= i*i+j*j;
                int sq=(int)Math.sqrt(res);
                if(sq*sq==res && sq <= n){
                    c++;
                }
            }
        }
        return c;
    }
}