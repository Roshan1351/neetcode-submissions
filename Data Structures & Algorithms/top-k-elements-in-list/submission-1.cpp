class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int n= nums.size();
        unordered_map<int, int> freq;
        for(int i= 0; i<n; i++){
            freq[nums[i]]++;
        }

        vector<int> ans;
        for(int i= 0; i<k ;i++){
            int maxcount= 0;
            int answer= 0;
            for(auto x: freq){
                if(maxcount<x.second){
                    maxcount= x.second;
                    answer= x.first;
                }
            }
            ans.push_back(answer);
            freq.erase(answer);
        }
        return ans;
    }
};
