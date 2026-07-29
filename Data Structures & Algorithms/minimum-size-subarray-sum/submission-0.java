class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res= Integer.MAX_VALUE;
        for(int i= 0; i<nums.length; i++){
            int cursum= 0;
            int j= i;
            while(j<nums.length){
                cursum+= nums[j];
                if(cursum>= target){
                    res= Math.min(res, j-i+1);
                    break;
                }
                j++;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}