class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> allRanges=new ArrayList<>(Arrays.asList(intervals));
        allRanges.add(newInterval);
        Collections.sort(allRanges, (a,b)->a[0]-b[0]);

        List<int[]> ans=new ArrayList<>();
        int[] curr=allRanges.get(0);

        for(int i=1;i<allRanges.size();i++){
            int[] interv=allRanges.get(i);
            if(curr[1]>=interv[0]){
                curr[1]=Math.max(curr[1],interv[1]);
            }
            else{
                ans.add(curr);
                curr=interv;
            }
        }
        ans.add(curr);
        return ans.toArray(new int[ans.size()][]);
    }
}