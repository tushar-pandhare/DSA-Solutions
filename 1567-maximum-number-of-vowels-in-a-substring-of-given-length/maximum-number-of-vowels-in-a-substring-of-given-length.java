class Solution {
    public int maxVowels(String s, int k) {
      int count=0,maxCount=0;
        String str="aeiou";
        int start=0;
        int end=0;
        for(end=0;end<k;end++){
            if(str.indexOf(s.charAt(end))!=-1){
                count++;
            }
        }
        maxCount=count;
        for(end=k;end<s.length();end++){
            char c=s.charAt(start++);
            if(str.indexOf(c)!=-1) count--;
            if(str.indexOf(s.charAt(end))!=-1){
                count++;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}