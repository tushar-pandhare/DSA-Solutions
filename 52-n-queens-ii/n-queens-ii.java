class Solution {
    int count = 0;
    public int totalNQueens(int n){
        int[][] board = new int[n][n];
        solve(board, 0, n);
        return count;
    }

    public void solve(int[][] board, int row, int n) {
        if(row == n){
            count++;
            return;
        }
        for(int col = 0; col < n; col++){
            if(checkValid(board, row, col, n)){
                board[row][col] = 1;
                    solve(board, row + 1, n);
                board[row][col] = 0;
            }
        }
    }

    public boolean checkValid(int[][] board, int row, int col, int n){
        for(int i=0;i<row;i++) 
            if(board[i][col]==1) 
                return false;

        for(int i=row-1,j=col-1; i>=0&&j>=0; i--,j--) 
            if(board[i][j]==1)
                return false;

        for(int i=row-1,j=col+1; i>=0&&j<n; i--,j++) 
            if(board[i][j]==1) 
                return false;

        return true;
    }
}
