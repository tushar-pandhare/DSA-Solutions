class Solution {
    public String firstPalindrome(String[] words){
	    for(String s: words){
	        if(isPalindrom(s)) return s;
	    }
	    return "";
	}
	public boolean isPalindrom(String s){
	    int start = 0 , end = s.length()-1;
	    while(start < end){
	        if(s.charAt(start) != s.charAt(end)) return false;
	        start++;end--;
	    }
	    return true;
	}
}