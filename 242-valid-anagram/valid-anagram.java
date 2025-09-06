class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(Character ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for(Character ch:t.toCharArray()){
        if(!map.containsKey(ch)) return false;
        map.put(ch,map.get(ch) - 1);
        if(map.get(ch)<0) return false;

       } 
        for (int count : map.values()) {
            if (count!=0) return false;
        }       
       return true;
    }
}