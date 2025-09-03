class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int p1 = 0;
        int p2 = 0;
        while(p1 < s.length() && p2 < t.length()){
            if(s.charAt(p1)==t.charAt(p2)){
                p1++;
                count++;
            }
            p2++;
        }
        return count==s.length();
    }
}