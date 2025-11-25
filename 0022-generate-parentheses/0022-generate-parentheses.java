class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        solve(ans,new StringBuilder(),n,0,0);
        return ans;
    }

    public void solve(List<String> ans,StringBuilder sb,int n, int open, int close){
        if(open==n && close==n){
            ans.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append('(');
            solve(ans,sb,n,open+1,close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close<open){
            sb.append(')');
            solve(ans,sb,n,open,close+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}