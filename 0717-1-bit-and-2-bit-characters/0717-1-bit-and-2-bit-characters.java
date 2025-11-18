class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int s=0;
        int e=bits.length;
        while(s<e-1){
            if(bits[s]==0) s++;
            else  s+=2;
        }

        return e-1==s;
    }
}