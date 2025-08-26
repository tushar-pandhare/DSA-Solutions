class Solution {
    class pair{
        int count;
        int index;
        pair(int index,int count){
            this.index=index;
            this.count=count;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<pair> priorityQueue=new PriorityQueue<>((a,b)->{
            if(a.count==b.count){
                return b.index-a.index;
            }
            return b.count-a.count;
        });
        int rows=mat.length;
        for(int i=0;i<rows;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1) count++;
            }
            priorityQueue.offer(new pair(i,count));
            if(priorityQueue.size()>k) priorityQueue.poll();
        }
        int ans[]=new int[k];
        int n=k-1;
        for(int i=k-1;i>=0;i--){
            ans[i]=priorityQueue.poll().index;
        }
        return ans;
    }
}