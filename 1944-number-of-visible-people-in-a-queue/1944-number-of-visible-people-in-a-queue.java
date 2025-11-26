class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n=heights.length;
        int ans[]=new int[n];
        ans[n-1]=0;
        st.push(heights[n-1]);
        for(int i=n-2;i>=0;i--){
        int count=0;
            while(!st.isEmpty() && st.peek()<heights[i])
            {
                st.pop();
                count++;
            }
            if(!st.isEmpty()) count++;
            st.push(heights[i]);
            ans[i]=count;
        }
        return ans;
    }
}
