// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(char ch:s.toCharArray()){
            if(ch!=sb.charAt(sb.length()-1)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}