class Solution {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,List<Integer> arr3){
        List<Integer> ans=new ArrayList<>();
        int i1=0,i2=0,i3=0;
        while(i1<arr1.size() && i2<arr2.size() && i3<arr3.size()){
            if(arr1.get(i1).equals(arr2.get(i2)) && arr2.get(i2).equals(arr3.get(i3))){
                if(ans.size()==0 || !ans.get(ans.size()-1).equals(arr1.get(i1)))
                    ans.add(arr1.get(i1));
                i1++;i2++;i3++;
            }
            else{
                if(arr1.get(i1)<arr2.get(i2)) i1++;
                else if(arr2.get(i2)<arr3.get(i3)) i2++;
                else i3++;
            }
        }
        if(ans.size()==0) ans.add(-1);
        return ans;
    }
}
