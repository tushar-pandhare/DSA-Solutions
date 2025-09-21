class Solution{
    public List<Integer> findSubstring(String s,String[] words){
        List<Integer> res=new ArrayList<>();
        if(s==null||words==null||words.length==0) return res;
        int wordLen=words[0].length();
        int wordCount=words.length;
        int targetLength=wordLen*wordCount;
        if(s.length()<targetLength) return res;
        HashMap<String,Integer> mainMap=new HashMap<>();
        for(String w:words) mainMap.put(w,mainMap.getOrDefault(w,0)+1);
        for(int shift=0;shift<wordLen;shift++){
            int left=shift,count=0;
            HashMap<String,Integer> windowMap=new HashMap<>();
            for(int right=shift;right+wordLen<=s.length();right+=wordLen){
                String w=s.substring(right,right+wordLen);
                if(mainMap.containsKey(w)){
                    windowMap.put(w,windowMap.getOrDefault(w,0)+1);
                    count++;
                    while(windowMap.get(w)>mainMap.get(w)){
                        String lw=s.substring(left,left+wordLen);
                        windowMap.put(lw,windowMap.get(lw)-1);
                        left+=wordLen;count--;
                    }
                    if(count==wordCount){
                        res.add(left);
                        String lw=s.substring(left,left+wordLen);
                        windowMap.put(lw,windowMap.get(lw)-1);
                        left+=wordLen;count--;
                    }
                }else{
                    windowMap.clear();count=0;left=right+wordLen;
                }
            }
        }
        return res;
    }
}
