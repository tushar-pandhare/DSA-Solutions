class Solution {
    int maxi=0;
    public int maximalSquare(char[][] matrix) {
        int n=matrix.length;
       int[][] dp=new int[matrix.length][matrix[0].length]; 
       for(int i=0;i<matrix[0].length;i++){
            dp[0][i]=matrix[0][i]-'0';
            maxi=Math.max(maxi,dp[0][i]);
       }
       for(int i=0;i<n;i++){
            dp[i][0]=matrix[i][0]-'0';
            maxi=Math.max(maxi,dp[i][0]);
        }

       for(int i=1;i<matrix.length;i++){
        for(int j=1;j<matrix[i].length;j++){
            if(matrix[i][j]=='1'){
                dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                maxi=Math.max(dp[i][j],maxi);
            }
        }
       }
       return maxi*maxi;
    }
}