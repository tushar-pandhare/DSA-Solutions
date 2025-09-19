class Solution {
    Boolean dp[][];
    public boolean isMatch(String s, String p) {
        dp=new Boolean[s.length()+1][p.length()+1];
        return solve(0,0,s,p);
    }

    public boolean solve(int si,int pi,String s,String p) {
        if(dp[si][pi]!=null) return dp[si][pi];
        if(pi==p.length()) return dp[si][pi]=si==s.length();

        boolean match = si<s.length() && (s.charAt(si)==p.charAt(pi) || p.charAt(pi)=='.');

        if(pi+1<p.length() && p.charAt(pi+1)=='*') {
            boolean take = solve(si,pi+2,s,p);
            boolean nottake = match && solve(si+1,pi,s,p);
            return dp[si][pi]=take||nottake;
        }

        return dp[si][pi]=match && solve(si+1,pi+1,s,p);
    }
}
