class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rowS=matrix.length;
        int colS=matrix[0].length;
        int[][] dp=new int[rowS][colS];
        for(int i=0;i<rowS;i++){
            for(int j=0;j<colS;j++){
                if(matrix[i][j]=='0'){
                    dp[i][j]=0;
                } else {
                    if(i==0) dp[i][j]=1;
                    else dp[i][j]=dp[i-1][j]+1;
                }
            }
        }
        int maxi=0;
        for(int i=0;i<rowS;i++){
            maxi=Math.max(maxi,lra(dp[i]));
        }
        return maxi;
    }
    public int lra(int[] ht){
        Stack<Integer> st=new Stack<>();
        int maxi=0;
        int n=ht.length;
        int h,l,r,w,cur;
        for(int i=0;i<=n;i++){
            cur=(i==n)?0:ht[i];
            while(!st.isEmpty()&&cur<ht[st.peek()]){
                 h=ht[st.pop()];
                 l=(st.isEmpty())?-1:st.peek();
                 r=i;
                 w=r-l-1;
                 maxi=Math.max(maxi,w*h);
            }
            st.push(i);
        }
        return maxi;
    }
}