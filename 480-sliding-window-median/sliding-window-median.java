class Solution{
    TreeMap<Integer,Integer> first=new TreeMap<>();
    TreeMap<Integer,Integer> sec=new TreeMap<>();
    int size1=0,size2=0;
    public double[] medianSlidingWindow(int[] nums,int k){
        ArrayList<Double> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            insertInSet(nums[i]);
            rebalance();
            if(i>=k-1){
                ans.add(findMedian(k));
                removeFromSet(nums[i-k+1]);
                rebalance();
            }
        }
        double[] res=new double[ans.size()];
        for(int i=0;i<ans.size();i++) res[i]=ans.get(i);
        return res;
    }
public void rebalance(){
        if(size1>size2+1){
            int val=first.lastKey();
             dec(first,val);
         size1--;
            sec.put(val,sec.getOrDefault(val,0)+1);
            size2++;
        }else if(size2>size1){
            int val=sec.firstKey();
            dec(sec,val);
            size2--;
            first.put(val,first.getOrDefault(val,0)+1);
            size1++;
        }
    }
    public void insertInSet(int a){
        if(first.isEmpty()||a<=first.lastKey()){
            first.put(a,first.getOrDefault(a,0)+1);
            size1++;
        }else{
            sec.put(a,sec.getOrDefault(a,0)+1);
            size2++;
        }
    }
    public void removeFromSet(int a){
        if(first.containsKey(a)){
            dec(first,a);
            size1--;
        }else{
            dec(sec,a);
            size2--;
        }
    }
    public double findMedian(int k){
        if(k%2==0){
            long a=first.lastKey();
            long b=sec.firstKey();
            return (a+b)/2.0;
        }
        return (double)first.lastKey();
    }
    public void dec(TreeMap<Integer,Integer> map,int key){
        map.put(key,map.get(key)-1);
        if(map.get(key)==0) map.remove(key);
    }
}
