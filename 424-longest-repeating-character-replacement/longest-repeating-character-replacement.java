class Solution {
    public int characterReplacement(String s, int k) {
        int[] c=new int[26];
        int maxi=0,l=0,res=0;

        for(int r=0;r<s.length();r++){
            int idx=s.charAt(r)-'A';
            c[idx]++;
            maxi=Math.max(maxi,c[idx]);

            while(r-l+1-maxi>k){
                c[s.charAt(l)-'A']--;
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}