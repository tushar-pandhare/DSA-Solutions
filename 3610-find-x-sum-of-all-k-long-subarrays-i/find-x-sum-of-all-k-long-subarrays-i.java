class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int[] ans= new int[n-k+1];
        int freq[]=new int[51];

        for(int i=0;i<k;i++) freq[nums[i]]++;
        ans[0]=solve(freq,x);

        for(int i=k;i<n;i++){
            freq[nums[i-k]]--;
            freq[nums[i]]++;
            ans[i-k+1]=solve(freq,x);
        }

        return ans;
    }

    public int solve(int[] freq, int x){
        List<int[]> st= new ArrayList<>();
        for(int i=1;i<=50;i++){
            if(freq[i]>0) st.add(new int[]{i,freq[i]});
        }

        st.sort((a,b)->{ 
        if(b[1]==a[1]) return b[0]-a[0];
         return b[1]-a[1];
        });

        int count=0,sum=0;
        for(int[] fr: st){
            if(count==x) break;
            sum += fr[0]*fr[1];
            count++;
        }
        return sum;
    }
}