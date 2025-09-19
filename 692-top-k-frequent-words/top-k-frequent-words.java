class Solution {
    class Pair{
        String str;
        int count;
        Pair(String s,int c){
            this.str=s;
            this.count=c;
        }
    }
    public List<String> topKFrequent(String[] words,int k){
        HashMap<String,Integer> map=new HashMap<>();
        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
            if(a.count==b.count) return b.str.compareTo(a.str);
            return a.count-b.count;
        });
        for(String w:map.keySet()){
            pq.offer(new Pair(w,map.get(w)));
            if(pq.size()>k) pq.poll();
        }
        List<String> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll().str);
        }
        Collections.reverse(ans);
        return ans;
    }
}
