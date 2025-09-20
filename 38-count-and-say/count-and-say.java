class Solution {
    String res="";
    public String countAndSay(int n) {
        return solve(n);
    }
    public String solve(int n){
        if(n==1){
            res="1";
            return res;
        }
        String curr=solve(n-1);
        StringBuilder sb=new StringBuilder("");
        int count=1;
        for(int i=0;i<curr.length();i++){
            if(i+1<curr.length()&&curr.charAt(i)==curr.charAt(i+1)) count++;
            else{
                sb.append(count);
                sb.append(curr.charAt(i));
                count=1;
            }
        }
        return res=sb.toString();
    }
}