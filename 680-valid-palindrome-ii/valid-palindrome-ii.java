class Solution {
    public boolean validPalindrome(String s1) {
        int s = 0;
        int e = s1.length()-1;
        while(s < e){
            if(s1.charAt(s) == s1.charAt(e)){
                s++;e--;
                continue;
            }
            else {
                return isPalindrome(s1 , s+1 , e) || isPalindrome(s1 , s , e-1);
            }
        }
        return true;
    }
    
    boolean isPalindrome(String s, int start , int end){
        while(start < end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}