class Solution {
    int count;
    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        count=0;
        boolean[] visited=new boolean[nums.length];
        solve(nums,temp,visited);
        return count;
    }
    public void solve(int[] nums,List<Integer> temp,boolean[] visited){
        if(temp.size()==nums.length){
            count++;return;
        }

        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && visited[i-1]!=true) continue;

            if(temp.size()>0){
                int sum=temp.get(temp.size()-1)+nums[i];
                int sqrt=(int)Math.sqrt(sum);
                if(sqrt*sqrt!=sum)
                    continue;
            }
            visited[i]=true;
            temp.add(nums[i]);
            solve(nums,temp,visited);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }
}