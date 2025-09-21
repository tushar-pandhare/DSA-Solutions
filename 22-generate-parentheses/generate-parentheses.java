class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res=new ArrayList<>();
        solve(n,0,0,"");
        return res;
    }
    public void solve(int n,int open,int close,String str){
        if(open+close == n*2){
            res.add(str);
            return;
        }

        // for(int i=0;i<n*2;i++){
            if(open<n){
                solve(n,open+1,close,str+'(');
            }
            if(close<open){
                solve(n,open,close+1,str+')');
            }
        // }
    }
}