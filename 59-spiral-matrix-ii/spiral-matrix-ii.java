class Solution {
    public int[][] generateMatrix(int n) {
        int i=1;
        int ans[][]=new int[n][n];
        int startRow=0;
        int endRow=n-1;
        int startCol=0;
        int endCol=n-1;
        while(startRow<=endRow && startCol<=endCol){       
            int temp=startCol;
            while(temp<=endCol){
                ans[startRow][temp]=i++;
                temp++;
            }
            startRow++;
            temp=startRow;
            while(temp<=endRow){
                ans[temp][endCol]=i++;
                temp++;
            }
            endCol--;
                temp=endCol;
                while(temp>=startCol){
                    ans[endRow][temp]=i++;
                    temp--;
                }
                endRow--;
                temp=endRow;
                while(temp>=startRow){
                    ans[temp][startCol]=i++;
                    temp--;
                }
                startCol++;
        }
        return ans;
    }
}
