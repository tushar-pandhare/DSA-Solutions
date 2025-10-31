class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int start=0,end=0;
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> pMap=new HashMap<>(); 
        HashMap<Character,Integer> sMap=new HashMap<>();

        //storing original string in set
        for(Character ch: p.toCharArray()){
            pMap.put(ch,pMap.getOrDefault(ch,0)+1);
        } 

        //checking anagrams      
        while(end<s.length()){
            
            //adding each letter to map2
            char ch=s.charAt(end); 
            if(pMap.containsKey(ch)){
                sMap.put(ch,sMap.getOrDefault(ch,0)+1);
            }

            if(end-start+1 > p.length()){
                char lchar=s.charAt(start++);
                if(sMap.containsKey(lchar)){
                    if(sMap.get(lchar)==1) sMap.remove(lchar);
                    else sMap.put(lchar,sMap.get(lchar)-1);
                }
            }

            if(pMap.equals(sMap) && end-start+1==p.length()){
                ans.add(start);
            }
        
            end++;
        }
        return ans;
    }
}