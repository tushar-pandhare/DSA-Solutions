class Solution {
    public boolean isMatch(String s, String p) {
        return solve(0,0,s,p);
    }

    public boolean solve(int si,int pi,String s,String p) {
        if(pi==p.length()) return si==s.length();

        boolean match = si<s.length() && (s.charAt(si)==p.charAt(pi) || p.charAt(pi)=='.');
        
        if(pi+1<p.length() && p.charAt(pi+1)=='*') {
            boolean take = solve(si,pi+2,s,p);
            boolean nottake = match && solve(si+1,pi,s,p);
            return take||nottake;
        }

        return match && solve(si+1,pi+1,s,p);
    }
}
