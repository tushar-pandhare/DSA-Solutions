class Solution {
    Boolean[][] dp;
    public boolean isMatch(String s, String p) {
        dp=new Boolean[s.length()][p.length()];
        return solve(s,p,s.length()-1,p.length()-1);
    }

    public boolean solve(String s,String p,int i,int j){
        if(i<0 && j<0) return true;
        if(j<0) return false;
        if(i<0){
            for(int k=0;k<=j;k++){
                if(p.charAt(k)!='*') return false;
            }
            return true;
        }
        if(dp[i][j]!=null) return dp[i][j];

        boolean charMatch=i>=0&&j>=0&&s.charAt(i)==p.charAt(j)||p.charAt(j)=='?';
        if(charMatch){
            return dp[i][j]=solve(s,p,i-1,j-1);
        }
        else if(j>=0&&p.charAt(j)=='*'){
            boolean inc = solve(s,p,i-1,j);
            boolean notinc = solve(s,p,i,j-1);
            return dp[i][j]=inc || notinc;
        }
        else{
            return dp[i][j]=false;
        }
    }
}