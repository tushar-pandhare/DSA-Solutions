class Solution {
    public int[][] rangeAddQueries(int n, int[][] q) {
        int[][] mat= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=0; //n^2
            }
        }
        solve(mat,n,q);
        return mat;
    }

    public void solve(int[][] mat, int n, int[][] q){
        // q.length
        for(int a[]:q){
            int r1=a[0];
            int r2=a[2];
            int c1=a[1];
            int c2=a[3];
            addElements(mat,r1,r2,c1,c2);
        }
    }

    public void addElements(int[][] mat, int r1, int r2, int c1, int c2){
        
        for(int i=r1; i<=r2; i++){
            for(int j=c1 ;j<=c2;j++){
                mat[i][j]+=1;
            }
        }
    }
}