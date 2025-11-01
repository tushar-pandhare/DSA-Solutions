class LUPrefix {

    TreeSet<Integer> set= new TreeSet<>();
    int maxi;
    public LUPrefix(int n) {
        for(int i=1;i<=n;i++){
            set.add(i);
        }
        maxi=n;
    }
    
    public void upload(int video) {
        set.remove(video);
    }
    
    public int longest() {
        if(set.isEmpty()){
            return maxi;
        }
        else{
            return set.first()-1;
        }
    }
}

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */