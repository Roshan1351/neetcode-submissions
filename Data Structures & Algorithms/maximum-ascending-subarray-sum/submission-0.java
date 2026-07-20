class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans= 0;
        for(int i= 0; i<nums.length; i++){
            int currsum= nums[i];
            for(int j= i+1; j<nums.length; j++){
                if(nums[j]<= nums[j-1]){
                    break;
                }
                currsum+= nums[j];
            }
            ans= Math.max(ans, currsum);
        }
        return ans;
    }
}