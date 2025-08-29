class Solution {
    public String firstPalindrome(String[] words){
	    for(String s: words){
	        if(isPalindrome(s)) return s;
	    }
	    return "";
	}
	public boolean isPalindrome(String s){
	    int start = 0 , end = s.length()-1;
	    while(start < end){
	        if(s.charAt(start++) != s.charAt(end--)) return false;
	    }
	    return true;
	}
}