class Solution {
public:
    int maxArea(vector<int>& heights) {
        int left= 0;
        int right= heights.size()-1;
        int ans= 0;
        while(left<right){
            int height= min(heights[left], heights[right]);
            int diff= abs(right-left);
            int currRes= height*diff;
            ans= max(ans, currRes);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
};
