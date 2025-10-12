class Solution {
    public int countDigits(int num) {
        int degs=num;
        int count=0;
        while(degs>0){
            int r=degs%10;
            if(num%r==0) count++;
            degs=degs/10;
        }
        return count;
    }
}