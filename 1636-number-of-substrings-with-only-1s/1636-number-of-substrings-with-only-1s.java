class Solution {
    public int numSub(String s) {
       long count_of_one=0;
       long maxi=0;
       int modulo=1000000007;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            count_of_one++;
            maxi=(count_of_one+maxi)%modulo;
        }
        else{
            count_of_one=0;
        }
       }
    return (int)maxi;
    }
}