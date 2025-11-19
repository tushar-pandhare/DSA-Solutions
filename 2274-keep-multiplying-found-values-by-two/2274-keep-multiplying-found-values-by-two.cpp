class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        unordered_set<int> search;
        for(int i=0; i<nums.size(); i++){
            search.insert(nums[i]);
        }
        while(search.count(original)){
            original*=2;
        }
        return original;
    }
};