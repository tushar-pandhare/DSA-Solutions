class Solution {
    public int lengthOfLongestSubstring(String s1) {
        int s=0;
        int maxi=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            if(set.contains(s1.charAt(i))){
                while(set.contains(s1.charAt(i))){
                    set.remove(s1.charAt(s++));
                }
            }
            set.add(s1.charAt(i));
            maxi=Math.max(maxi,i-s+1);
        }
        return maxi;
    }
}