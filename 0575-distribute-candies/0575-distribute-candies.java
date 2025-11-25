class Solution {
    public int distributeCandies(int[] candyType) {
        int x=candyType.length/2;

        int idx=0;
        int num=1;
        HashSet<Integer> set=new HashSet<>();
        while(idx < candyType.length && num<=x){
            if(set.add(candyType[idx])){
                num++;
            }
            idx++;
        }
        return num-1;
    }
}