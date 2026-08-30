class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int high= 0, low= 0, count= 0, prod= 1;
        while(high<nums.length){
            prod= prod*nums[high];
            while(prod>=k){
                prod/= nums[low];
                low++;
            }
            count+= high-low+1;
            high++;
        }
        return count;
    }
}