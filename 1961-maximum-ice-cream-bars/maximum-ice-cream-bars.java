class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0,count=0;
        for(int i=0;i<costs.length;i++){
            sum+=costs[i];
            if(sum>coins) return count;
            count++;
        }
        return count;
    }
}