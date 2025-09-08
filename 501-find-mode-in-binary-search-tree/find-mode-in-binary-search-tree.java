class Solution {
    public int[] findMode(TreeNode root) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        dfs(root,map);
        int freq=Collections.max(map.values());
        ArrayList<Integer> ans=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==freq){
                ans.add(key);
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
    public void dfs(TreeNode root,TreeMap<Integer,Integer> map){
        if(root==null) return;
        dfs(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        dfs(root.right,map);
    }
}
